import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		Main main = new Main();
		main.run();
	}

	private void run() throws IOException {
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] values = br.readLine().split(" ");
		int N = Integer.parseInt(values[0]);
		int X = Integer.parseInt(values[1]);
		int Y = Integer.parseInt(values[2]);
		//距離
		int[] ks = new int[N+1];
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				int dist1 = j-i;
				int dist2 = Math.abs(X-1-i) + Math.abs(Y-1-j) + 1;
				int dist = Math.min(dist1, dist2);
				ks[dist]++;
			}
		}
		for(int k=1; k < N; k++) {
			out.println(ks[k]);
		}
		out.flush();
		br.close();
	}
}