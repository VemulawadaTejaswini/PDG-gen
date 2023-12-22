import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		while (Q-- > 0) {
			/*
			 * make follow team CCA CCC CAN
			 */
			int c = sc.nextInt();
			int a = sc.nextInt();
			int n = sc.nextInt();
			int cnt = 0;
			while (true) {
				if (a > 0 && c > 0) {
					if (n > 0) {
						c--;
						a--;
						n--;
						cnt++;
					} else {
						if (c > 1) {
							c -= 2;
							a--;
							cnt++;
						}
					}
				} else if (c > 2) {
					c -= 3;
					cnt++;
				} else {
					break;
				}
			}
			System.out.println(cnt);
		}
	}

}