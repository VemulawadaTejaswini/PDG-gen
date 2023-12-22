import java.util.Scanner;

public class Main {
	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		while (sc.hasNext()) {
			int n = sc.nextInt();
			int count = 0;
			for (int i = 2; i <= n; i++) {
				boolean type = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						type = false;
						break;
					}
				}
				if (type) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}