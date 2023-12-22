import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		String[] tmp = input.split(" ",0);
		int n = Integer.parseInt(tmp[0]);
		int Q = Integer.parseInt(tmp[1]);
		int[] c = new int[n];
		input = in.readLine();
		tmp = input.split(" ",0);
		for (int i = 0; i < n; i++)
			c[i] = Integer.parseInt(tmp[i]);
		for (int i = 0; i < Q; i++) {
			int r, max = 0, q = Integer.parseInt(in.readLine());
			for (int j = 0; j < n; j++) {
				r = c[j] % q;
				if (r > max)
					max = r;
			}
			System.out.println(max);
		}
	}
}