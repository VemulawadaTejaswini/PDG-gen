import java.util.*;
public class Main {
	public static class Work{
		private int A;
		private int B;
		
		public Work(int A, int B) {
			this.A = A;
			this.B = B;
		}
		
		public int getA() {
			return A;
		}
		public int getB() {
			return B;
		}
	}
	
	public static class Comp implements Comparator<Work> {
	    public int compare(Work x1, Work x2) { 
	        if(x1.getB() < x2.getB()) {
	            return -1;
	        } 
	        else if(x1.getB() > x2.getB()){
	            return 1;
	        } 
	        else{ 
	        	if(x1.getA() < x2.getA()) {
	        		return 1;
	        	}
	        	else if(x1.getA() > x2.getA()) {
	        		return -1;
	        	}
	        	else {
	        		return 0;
	        	}
	        }
	    }
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		ArrayList<Work> x = new ArrayList<Work>();
		
		for(int i = 0; i < N; i++) {
			int A = stdIn.nextInt();
			int B = stdIn.nextInt();
			Work work = new Work(A,B);
			x.add(work);
		}
		
		Collections.sort(x, new Comp());
		long sum = 0;
		for(Work y:x) {
			sum += y.getA();
			if(sum > y.getB()) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");

	}

}