
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] num = new int[n + 1];
			for (int i = 0; i < n; i++)
				num[i] = scanner.nextInt();
			num[n] = 1 << 30;
			StringBuilder builder = new StringBuilder();
			builder.append(num[0]);
			for (int i = 1; i < n; i++)
				if (num[i - 1] + 1 == num[i])
					if (num[i] + 1 == num[i + 1])
						continue;
					else
						builder.append('-').append(num[i]);
				else
					builder.append(' ').append(num[i]);
			System.out.println(builder);
		}
	}
}