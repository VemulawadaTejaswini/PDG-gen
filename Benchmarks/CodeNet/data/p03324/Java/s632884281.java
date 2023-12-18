import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int N = sc.nextInt();

		int num = 1;
		for (int i = 0; i <= D; i++) {
			if (i == 0)
				continue;
			num = num * 100;
		}

		System.out.println(N * num);
	}
}
