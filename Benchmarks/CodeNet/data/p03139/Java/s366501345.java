import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subscribers {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			String[] input = line.split(" ", 0);

			int N = Integer.parseInt(input[0]);
			int A = Integer.parseInt(input[1]);
			int B = Integer.parseInt(input[2]);

			int mn = 0;
			if (A + B > N) {
				mn = (A + B) - N;
			}
			int mx = Math.min(A, B);
			
			System.out.println(mx + " " + mn);

		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}
}
