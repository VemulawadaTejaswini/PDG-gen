import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long result = 0;
		for (int i = 1; i <= N; i++) {
			if (i % 5 == 0 || i % 3 == 0) {
				continue;
			} else {
				result += (long)i;
			}
		}
		System.out.println(result);
	}

}
