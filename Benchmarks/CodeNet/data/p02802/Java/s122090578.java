import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		boolean[] ac = new boolean[n];
		int[] pe = new int[n];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int p = Integer.parseInt(sa[0]) - 1;
			if (!ac[p]) {
				if ("AC".equals(sa[1])) {
					ac[p] = true;
				} else {
					pe[p]++;
				}
			}
		}
		br.close();

		int ca = 0;
		int cp = 0;
		for (int i = 0; i < n; i++) {
			if (ac[i]) {
				ca++;
				cp += pe[i];
			}
		}
		System.out.println(ca + " " + cp);
	}
}
