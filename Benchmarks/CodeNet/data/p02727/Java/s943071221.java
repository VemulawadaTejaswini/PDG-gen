import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		Main main = new Main();
		main.run();
	}

	private void run() throws IOException {
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] values = br.readLine().split(" ");
		int X = Integer.parseInt(values[0]);
		int Y = Integer.parseInt(values[1]);
		int A = Integer.parseInt(values[2]);
		int B = Integer.parseInt(values[3]);
		int C = Integer.parseInt(values[4]);

		values = br.readLine().split(" ");
		Integer[] reds = new Integer[A];
		for(int i = 0; i < A; i++) {
			reds[i] = Integer.parseInt(values[i]);
		}
		Arrays.sort(reds, Collections.reverseOrder());

		values = br.readLine().split(" ");
		Integer[] greens = new Integer[B];
		for(int i = 0; i < B; i++) {
			greens[i] = Integer.parseInt(values[i]);
		}
		Arrays.sort(greens, Collections.reverseOrder());

		values = br.readLine().split(" ");
		Integer[] noCols = new Integer[C];
		for(int i = 0; i < C; i++) {
			noCols[i] = Integer.parseInt(values[i]);
		}
		Arrays.sort(noCols, Collections.reverseOrder());

		Integer[] apples = new Integer[X+Y];
		for(int i = 0; i < X; i++) {
			apples[i] = reds[i];
		}
		for(int i = 0; i < Y; i++) {
			apples[X+i] = greens[i];
		}
		Arrays.sort(apples);

		double[] vals = new double[X+Y];
		vals[0] = apples[0];
		for(int i = 1; i < X+Y; i++) {
			vals[i] = vals[i-1] + apples[i];
		}
		double[] vals2 = new double[C];
		vals2[0] = noCols[0];
		for(int i = 1; i < C; i++) {
			vals2[i] = vals2[i-1] + noCols[i];
		}

		int n = -1;
		int m = Math.min(X+Y, C);
		for(int i = 0; i < m; i++) {
			if(vals2[i] > vals[i]) {
				n = i;
			}
		}

		double result = vals[X+Y-1];
		if(n !=-1) {
			result = vals[X+Y-1] - vals[n] + vals2[n];
		}
		out.println(BigDecimal.valueOf(result).toPlainString());
		out.flush();
		br.close();
	}
}