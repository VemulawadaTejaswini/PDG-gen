import java.util.Scanner;

public class Main {
	
	public void solve() {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int k = input.nextInt();
		int[] A = new int[b-a+1];
		int v = a;
		for(int i = 0; i < b - a + 1; i++) {
			A[i] = v;
			v++;
		}

//		display(0,A.length,A);
//      System.out.println();
		
		if( k >= A.length) {
			display(0, A.length, A);
			return;
		}

//        System.out.println("a : " + a + ", b : " + b + ", (b-a+1)/2 : " + (b-a+1)/2);
		if (k <= (b-a+1)/2) {
//            System.out.println("not duplicate");
			display(0, k, A);
	 		display(A.length - k, A.length, A);			
		} else {
//            System.out.println("duplicate");
			display(0, k, A);
	 		display(k, A.length, A);						
		}		
	}
	
	private void display(int from, int to, int[] A) {
		for (int i = from; i < to; i++) {
			System.out.println(A[i]);
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}

}
