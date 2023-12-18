import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.stream.Stream;
public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out);) {
			int N = Integer.parseInt(br.readLine());
			int[][] CSF = new int[N][3];
			for (int i = 0; i < N - 1; i++) {
				CSF[i] = Stream.of(br.readLine().split("[\\s]+")).mapToInt(Integer::parseInt).toArray();
			}
			int[] x = new int[N];
			for (int i = N - 2; i >= 0; i--) {
				int t = CSF[i][1];
				for (int j = i; j < N - 1; j++) {
					if (CSF[j][1] > t) {
						t = CSF[j][0] + CSF[j][1];
					} else if (t % CSF[j][2] > 0) {
						t += t % CSF[j][2];
					} else {
						t += CSF[j][0];
					}
				}
				x[i] = t;
			}
			for (int i = 0; i < x.length; i++) {
				pw.println(x[i]);
			}
			pw.flush();
		} catch (Exception e) {
		}
	}
}