import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// StringTokenizer st = new StringTokenizer(br.readLine());
		long n1 = Long.parseLong(br.readLine());
		long tmp = 0;
		long insuu1 = 0;
		long insuu2 = 0;

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i * j == n1) {
					if (i + j < tmp || tmp == 0) {
						insuu1 = i;
						insuu2 = j;
					}
					tmp = i + j;
				}
			}
		}

		System.out.println(insuu1 + insuu2 - 2);
	}
}