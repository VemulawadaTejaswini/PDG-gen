import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] in1 = str.split(" ");
		int N = Integer.parseInt(in1[0]);
		int M = Integer.parseInt(in1[1]);
		str = br.readLine();
		String[] rowstr = str.split(" ");
		int[] row = new int[N];
		for (int i = 0; i < N; i++) {
			row[i] = Integer.parseInt(rowstr[i]);
		}
		str = br.readLine();
		String[] colstr = str.split(" ");
		int[] col = new int[M];
		for (int i = 0; i < M; i++) {
			col[i] = Integer.parseInt(colstr[i]);
		}
		long lengsum = 0;
		for (int k = 0; k < M - 1; k++) {
			for (int l = k + 1; l < M; l++) {
				lengsum += col[l] - col[k];
			}
		}
		long areasum = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				areasum += lengsum * (row[j] - row[i]);
				areasum = areasum % 1_000_000_007;
			}
		}
		System.out.println(areasum);
	}
}
