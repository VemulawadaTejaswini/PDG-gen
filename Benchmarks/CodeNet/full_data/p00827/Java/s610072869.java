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
				int[] sumi = new int[sum + 1];
				int[] sumj = new int[sum + 1];
				boolean[] s = new boolean[sum + 1];
				for (int i = 0; i < sum + 1; i++)
					s[i] = false;
				boolean find = false;
				for (int i = 0; i <= sum; i++) {
					int j = sum - i;
					if (a * i + b * j == d || a * i == b * j + d
							|| b * j == a * i + d) {
						sumi[i] = i;
						sumj[i] = j;
						s[i] = true;
						find = true;
					}
				}
				if (find) {
					for (int i = 0; i < sum + 1; i++) {
						if (s[i] && a * x + b * y > a * sumi[i] + b * sumj[i]) {
							x = sumi[i];
							y = sumj[i];
						}
					}
					break;
				} else
					sum++;
			}
			System.out.println(x + " " + y);
		}
		sc.close();
	}
}