import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String S[] = new String[3];

			int N = Integer.parseInt(br.readLine());

			for (int i = 0; i < 3; i++) {
				S[i] = br.readLine().trim();
			}

			int op = 0;

			for (int i = 0; i < N; i++) {
				HashMap<Character, int[]> cnt = new HashMap<Character, int[]>();

				for (int j = 0; j < 3; j++) {
					if (i < S[j].length()) {
						int[] e = cnt.get(S[j].charAt(i));
						if (e == null) {
							e = new int[1];
							e[0] = 1;
							cnt.put(S[j].charAt(i), e);
						} else {
							e[0]++;
						}
					}
				}

				int mx = 0;
				char mxc = 0;
				for (Entry<Character, int[]> e : cnt.entrySet()) {
					if (e.getValue()[0] > mx) {
						mx = e.getValue()[0];
						mxc = e.getKey();
					}
				}

				if (mx > 0) {
					for (int j = 0; j < 3; j++) {
						if (i >= S[j].length()) {
							op++;
						} else if (S[j].charAt(i) != mxc) {
							op++;
						}
					}
				}
			}
			
			System.out.println(op);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}
}
