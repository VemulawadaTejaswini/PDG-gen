import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(r.readLine());
		String[] ps = r.readLine().split("\\s");
		int[] p = new int[N];
		for (int j = 0; j < N; j++)
			p[j] = Integer.parseInt(ps[j]);
		PrintWriter pw = new PrintWriter(System.out);
		for (int j = 0; j < N; j++) {
			pw.print(1 + (N + 1) * j);
			if (j < N-1)
				pw.print(" ");
		}
		pw.println();
		for (int j = 0; j < N; j++) {
			int il = (N + 1) * (N - j) - N;
			pw.print(il + p[j] - 1);
			if (j < N-1)
				pw.print(" ");
		}
		
		pw.close();
		r.close();
	}
	
}
