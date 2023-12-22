
import java.util.Scanner;

public class Main {

	static int n;
	static int[] A;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}
		int q = scan.nextInt();
		int[] M = new int[q];
		for (int i = 0; i < q; i++) {
			M[i] = scan.nextInt();
			if (solve(0, M[i])) {
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
		
		scan.close();
	}
	
	// ??\?????????M???????????????????´????????????????????????°??¢??°
	public static boolean solve(int i, int m){
		if (m == 0) {
			return true;
		}
		if (i >= n) {
			return false;
		}
		return solve(i + 1, m) || solve(i + 1, m - A[i]);
		
	}
}