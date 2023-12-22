import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d = sc.nextInt();
			if (a == 0 && b == 0 && d == 0)
				break;
			int sum = 0;
			int x = 10000, y = 10000;
			while (true) {
				boolean find = false;
				for (int i = 0; i <= sum; i++) {
					int j = sum - i;
					if ((i <= 10000 && j <= 10000)
							&& (a * i + b * j == d || a * i == b * j + d || b
									* j == a * i + d)) {
						if (a * x + b * y > a * i + b * j) {
							x = i;
							y = j;
						}
						find = true;
					}
				}
				if (find)
					break;
				else
					sum++;
			}
			System.out.println(x + " " + y);
		}
		sc.close();
	}
}