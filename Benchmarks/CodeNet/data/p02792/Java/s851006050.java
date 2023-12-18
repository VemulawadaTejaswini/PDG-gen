import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int result = 0;
		for (int i = 1; i <= N; i++)
			for (int j = 1; j <= i; j++)
				if (head(i) == tail(j) && tail(i) == head(j))
					result++;
		System.out.println(result);
	}

	static int head(int n) {
		if (n / 10 == 0)
			return n;
		return head(n / 10);
	}

	static int tail(int n) {
		return n % 10;
	}

}
