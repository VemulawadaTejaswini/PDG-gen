import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		try {
			while ((line = br.readLine()) != null) {
				line = line.trim();
				int num = Integer.parseInt(line);
				if (num < 0 || num > 50)
					System.exit(-1);

				int count = 0;
				if (num / 4.0 <= 9.0) {
					for (int a = 0; a < 10; a++) {
						for (int b = 0; b < 10; b++) {
							for (int c = 0; c < 10; c++) {
								for (int d = 0; d < 10; d++) {
									if(a + b + c + d == num) count++;
								}
							}
						}
					}
				}
				System.out.println(count);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static int factorial(int n) {
		if (n == 1)
			return 1;
		else {
			return n * factorial(n - 1);
		}
	}
}