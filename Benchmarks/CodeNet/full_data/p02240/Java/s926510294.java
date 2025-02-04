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
				if (cc[t] == -1) {
					cc[s] = cc[t] = i;
				} else { // cc[t] != -1
					cc[s] = cc[t];
				}
			} else { // cc[s] != -1
				if (cc[t] == -1) {
					cc[t] = cc[s];
				} else { // cc[t] != -1
					// continue;
				}
			}
		}

		StringBuilder ans = new StringBuilder();

		int q = Integer.parseInt(br.readLine());
		for (int i=0; i < q; i++) {
			data = br.readLine().split(" ");
			int s = Integer.parseInt(data[0]);
			int t = Integer.parseInt(data[1]);

			if (cc[s] == cc[t]) ans.append("yes\n");
			else ans.append("no\n");
		}

		System.out.print(ans);
	}

}