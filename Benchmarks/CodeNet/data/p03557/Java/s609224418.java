
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

			int count = 0;
			for (int i = 0; i < n; i++) {
				int valueA = a[i];
				for (int j = 0; j < n; j++) {
					int valueB = b[j];
					if (valueB > valueA) {
						for (int k = 0; k < n; k++) {
							int valueC = c[k];
							if (valueC > valueB) {
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
