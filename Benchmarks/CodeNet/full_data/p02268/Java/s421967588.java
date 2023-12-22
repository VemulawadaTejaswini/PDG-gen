import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in) );

		int n = Integer.parseInt(br.readLine());

		String[] temp;
		temp = br.readLine().split(" ");

		int[] S = new int[n];
		for (int i=0; i < n; i++) {
			S[i] = Integer.parseInt(temp[i]);
		}

		int q = Integer.parseInt(br.readLine());

		temp = br.readLine().split(" ");

		int[] T = new int[q];
		for (int i=0; i < q; i++) {
			T[i] = Integer.parseInt(temp[i]);
		}

		int count = 0;
		for (int i=0; i < q; i++) {
			count += binarySearch(T[i], S);
		}

		System.out.println(count);
	}

	static int binarySearch(int Ti, int[] S) {
		int l = 0;
		int r = S.length;
		while (l < r) {
			int m = (l + r) / 2;
			if (Ti == S[m]) return 1;
			else if (Ti < S[m]) r = m;
			else l = m+1;
		}
		return 0;
	}
}