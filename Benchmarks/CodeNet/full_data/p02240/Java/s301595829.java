import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	// connected components
	// cc[-1] : not searched
	// cc[s] = cc[t] : same component
	static int[] cc;

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String[] data = br.readLine().split(" ");
		int n = Integer.parseInt(data[0]);
		int m = Integer.parseInt(data[1]);

		cc = new int[n];
		Arrays.fill(cc, -1);

		for (int i=0; i < m; i++) {
			data = br.readLine().split(" ");
			int s = Integer.parseInt(data[0]);
			int t = Integer.parseInt(data[1]);

			if (cc[s] == -1) {
				if (cc[t] == -1) { // cc[s] =-1 & cc[t] = -1
					cc[s] = cc[t] = i;
				} else { // cc[s] = -1 & cc[t] != -1
					cc[s] = cc[t];
				}
			} else { // cc[s] != -1
				if (cc[t] == -1) { // cc[s] != -1 & cc[t] == -1
					cc[t] = cc[s];
				} else { // cc[s] != -1 & cc[t] != -1
					int temps = cc[s];
					int tempt = cc[t];

					for (int j=0; j < n; j++) {
						if (cc[j]==tempt) {
							cc[j] = temps;
						}
					}
				}
			}
		}
//		System.out.println(Arrays.toString(cc));
		StringBuilder ans = new StringBuilder();

		int q = Integer.parseInt(br.readLine());
		for (int i=0; i < q; i++) {
			data = br.readLine().split(" ");
			int s = Integer.parseInt(data[0]);
			int t = Integer.parseInt(data[1]);

			// cc[s] != cc[t] => no
			// cc[s] = cc[t] = -1 => no
			if (cc[s] == cc[t] && cc[s] != -1) ans.append("yes\n");
			else ans.append("no\n");
		}

		System.out.print(ans);
	}

}