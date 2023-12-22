import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in) );

		int n = Integer.parseInt( br.readLine() );

		String[] data = br.readLine().split(" ");
		int[] A = new int[n];
		for (int i=0; i < n; i++) {
			A[i] = Integer.parseInt(data[i]);
		}

		int q = Integer.parseInt( br.readLine() );

		data = br.readLine().split(" ");
		int[] M = new int[q];
		for (int i=0; i < q; i++) {
			M[i] = Integer.parseInt(data[i]);
		}

		for (int i=0; i < q; i++) {
			if ( solve(0, M[i], A) )
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}

	static boolean solve(int i, int m, int[] A) {
		if (m == 0) return true;
		if (i >= A.length) return false;
		boolean res = solve(i+1, m, A) || solve(i+1, m-A[i], A);
		return res;
	}
}