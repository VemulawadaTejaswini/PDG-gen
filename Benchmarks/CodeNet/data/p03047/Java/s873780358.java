import java.util.Scanner;

public class Problem {

	int[] arr = new int[100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem  A = new Problem();
		A.solve();
	}
	
	public void solve() {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		System.out.println(n-m+1);
	}
}
