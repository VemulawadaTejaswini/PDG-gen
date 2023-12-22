import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
		int n = Integer.parseInt(r.readLine());
		String Sinput = r.readLine();
		String[] S = Sinput.split(" ", 0);
		int q = Integer.parseInt(r.readLine());

		String Tinput = r.readLine();
		String[] T =  Tinput.split(" ", 0);
		int cnt = 0;
		for (int i=0; i<q; i++) {
			for (int j=0; j<n; j++) {
				if (Integer.parseInt(T[i]) == Integer.parseInt(S[j])) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}