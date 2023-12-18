import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out);) {
			int N = Integer.parseInt(br.readLine());
			int[][] CSF = new int[N][3];
			for (int i = 0; i < N - 1; i++) {
				CSF[i] = Stream.of(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
			}
			int[] x = new int[N];
			int t = 0;
			int S = 0;
			for (int i = N - 2; i >= 0; i--) {
				S = Integer.max(S, CSF[i][0] + CSF[i][1]);
				t = IntStream.range(i, N - 1).map(j -> CSF[j][0]).sum() + CSF[i][1];
				x[i] = Integer.max(t, S);
			}
			for (int i = 0; i < x.length; i++) {
				pw.println(x[i]);
			}
			pw.flush();
		} catch (Exception e) {
		}
	}
}