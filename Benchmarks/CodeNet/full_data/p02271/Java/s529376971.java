import java.util.Scanner;

public class Main {
	  static boolean solve(int i, int m, int[] A) {
	        if (m == 0) return true;
	        if (i >= A.length) return false;
	        boolean res = solve(i+1, m, A) || solve(i+1, m-A[i], A);
	        return res;
	    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}
		int q = scanner.nextInt();
		int[] m = new int[q];
		for (int i = 0; i < q; i++) {
			m[i] = scanner.nextInt();
		}
		 for (int i=0; i < q; i++) {
	            if ( solve(0, m[i], A) )
	                System.out.println("yes");
	            else
	                System.out.println("no");
	        }

	}

}
