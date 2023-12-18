import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int num = 0;

		for (int i = 0; i < k; i++) {
			if (a > 0) {
				num++;
				a--;
			} else if (b > 0) {
				b--;
			} else if (c > 0) {
				num--;
				c--;
			}
		}

		System.out.println(num);

	}

}