import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0, x = 0, answer = 0;

		while (true) {
			try {
				n = in.nextInt();
				x = in.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (n == 0 && x == 0)
				break;
			
			for (int i = 1; i <= n - 2; ++i) {
				for (int j = i + 1; j <= n - 1; ++j) {
					for (int k = j + 1; k <= n; ++k) {
						if (i + j + k == x)
							++answer;
					}
				}
			}
			System.out.println(answer);
		}
		in.close();
	}
}