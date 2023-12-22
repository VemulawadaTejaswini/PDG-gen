import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		while ((line = br.readLine()) != null) {
			String[] params = line.trim().split("\\s");
			int n = Integer.parseInt(params[0]),
				s = Integer.parseInt(params[1]);
			int N = (int) Math.pow(10, n);

			int count = 0;
			for (int i = 0 ; i < N ; i++) {
				String K = String.format("%0"+n+"d", i);
				int f = 0;
				for (int j = 0 ; j < n ; j++) {
					f = f | (int) Math.pow(2, (K.charAt(j)-48));
				}
				if (Integer.bitCount(f) < n) continue;

				f = 0;
				for (int j = 0 ; j < n ; j++) {
					f += (j+1) * (int) (K.charAt(j)-48);
				}
				if (f == s) count++;
			}
			System.out.println(""+count);

		}

	}
}