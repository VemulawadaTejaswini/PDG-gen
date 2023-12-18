import java.util.*;
public class Main {
	public static class Res{
		private String S;
		private int P;
		private int index;
		
		public Res(String S, int P, int i) {
			this.S = S;
			this.P = P;
			this.index = i;
		}
		
		public String getS() {
			return S;
		}
		public int getP() {
			return P;
		}
		public int getIndex() {
			return index;
		}
	}
	
	public static class Comp implements Comparator<Res> {
	    public int compare(Res x1, Res x2) {
	        if(x1.getS().equals(x2.getS())) {
	        	if(x1.getP() < x2.getP()) {
	        		return 1;
	        	}
	        	else {
	        		return -1;
	        	}
	        }
	        else{
	        	return x1.getS().compareTo(x2.getS());
	        }
	    }
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		ArrayList<Res> restaurants = new ArrayList<Res>();
		
		for(int i = 0; i < N; i++) {
			String S = stdIn.next();
			int P = stdIn.nextInt();
			Res res = new Res(S, P, i+1);
			restaurants.add(res);
		}
		
		Collections.sort(restaurants, new Comp());
		
		Iterator iterator = restaurants.iterator();
		while(iterator.hasNext()){
			Res res = (Res)iterator.next();
			System.out.println(res.getIndex());
		}

	}

}