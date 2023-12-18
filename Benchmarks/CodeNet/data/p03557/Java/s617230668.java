import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());

			int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] c = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			Arrays.sort(a);
			Arrays.sort(b);
			Arrays.sort(c);

			int count = 0;
			int AIndex = 0;
			int CIndex = 0;
			for (int j = 0; j < n; j++) {
				int Acount = n;

				for (int i = AIndex; i < n; i++) {
					if (a[i] >= b[j]) {
						AIndex = i;
						Acount = i;
						break;
					}
				}
				int Ccount = 0;
				for (int k = CIndex; k < n; k++) {
					if (b[j] < c[k]) {
						Ccount = n - k;
						CIndex = k;
						break;
					}
				}

				count += Acount * Ccount;
			}
			System.out.println(count);
		}
	}
}
