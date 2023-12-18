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
		
		if( k > A.length) {
			for (int i = 0; i < A.length; i++) {
				System.out.println(A[i]);
			}
			return;
		}
		
		if (k <= (b - a)/2) {
			display(0, k, A);
	 		display(A.length - k, A.length, A);			
		} else {
			display(0, k, A);
	 		display(A.length - k + 1, A.length, A);						
		}		
	}
	
	public static void display(int from, int to, int[] A) {
		for (int i = from; i < to; i++) {
			System.out.println(A[i]);
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}

}
