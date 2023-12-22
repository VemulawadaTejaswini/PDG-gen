import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
		int n = Integer.parseInt(r.readLine());
		System.out.println(n);
		String Sinput = r.readLine();
		String[] S = Sinput.split(" ", 0);
		System.out.println(S);
		int q = Integer.parseInt(r.readLine());
		System.out.println(q);

		String Tinput = r.readLine();
		String[] T =  Tinput.split(" ", 0);
		int cnt = 0;
		int SBefore = Integer.parseInt(S[0]);
		int SNext;
		for (int i=0; i<n; i++) {
			for (int j=0; j<q; j++) {
				if(i < n) {
					if ((SBefore != Integer.parseInt(S[i+1])) && (Integer.parseInt(S[i]) == Integer.parseInt(T[j]))) {
						cnt++;
						SBefore = Integer.parseInt(S[i+1]);

					} else {
						System.out.println("skip");
					}
				}

			}
		}
		System.out.println(cnt);
	}

}