import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int x = sc.nextInt();
			int i = 0;
			if (n == 0 && a == 0 && b == 0 && c == 0 && x == 0)
				break;
			int num[] = new int[n];
			int count = 0;
			for (i = 0; i < n; i++) {
				num[i] = sc.nextInt();
			}
			for (i = 0; i <= 10000; i++) {
				if (num[count] == x) {
					count += 1;
				}
				if (count == n)
					break;
				x = (a * x + b) % c;
			}
			if (i != 10001)
				System.out.println(i);
			else
				System.out.println(-1);
		}
	}
}