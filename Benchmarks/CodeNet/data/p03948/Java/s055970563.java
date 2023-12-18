import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] sp = line.split(" ");
		int n = Integer.parseInt(sp[0]);
		line = br.readLine();
		sp = line.split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sp[i]);
		}

		int max = 0;
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int s = a[j] - a[i];
				if (s > max) {
					max = s;
					count = 1;
				}
				else if (s == max) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
