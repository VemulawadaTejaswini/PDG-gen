import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while (true) {
			int max = (int) Math.sqrt(x) + 1;
			boolean flag = true;
			for (int i = 2; i < max; i++) {
				if (x % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(x);
				break;
			} else {
				++x;
				continue;
			}
		}
	}
}
