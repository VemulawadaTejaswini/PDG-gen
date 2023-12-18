import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int[] a = new int[n];
			int total = 0;
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(str[i]);
				total += Math.abs(a[i] - (i + 1));
			}
			int b = total / n;
			int sad = Integer.MAX_VALUE;
			for (int i = 0; i <= b; i++) {
				int tmpSad = 0;
				for (int j = 0; j < n; j++) {
					tmpSad += Math.abs(a[j] - (i + (j + 1)));
				}
				sad = Math.min(tmpSad, sad);

			}
			System.out.println(sad);

		} catch (IOException e) {

		}
	}

}
