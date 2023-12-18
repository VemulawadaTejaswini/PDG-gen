import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();

		Long sum = (long) 0;
		for (int i = 1; i <= N; i++) {
			if (i % 3 == 0)
				continue;
			else if (i % 5 == 0)
				continue;
			else if (i % 15 == 0)
				continue;
			else
				sum += i;
		}

		System.out.println(sum);
		sc.close();

	}
}