
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int H = sc.nextInt();
		int L = sc.nextInt();
		int[] t = new int[N];
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		int B = 0, money = 0;
		boolean flag = true;
		while (flag) {
			for (int i = 0; i < N; i++) {
				if (T == L) {
					if (t[i] != 0) {
						B = i;
						flag = false;
						break;
					} else {
						if (h[i] == 0) {
							B = i;
							flag = false;
							break;
						}
						if ((money + 10) / 10 > T) {
							B = i;
							flag = false;
							break;
						}
						h[i]--;
						H++;
						t[i] += (money + 10) / 10;
						money = 0;
					}
				} else {
					if (t[i] != 0) {
						t[i]--;
						T++;
						money += 10;
						if (money == 90) {
							money = 0;
						}
						continue;
					} else {
						if (h[i] == 0) {
							B = i;
							flag = false;
							break;
						}
						if ((money + 10) / 10 > T) {
							B = i;
							flag = false;
							break;
						}
						h[i]--;
						H++;
						t[i] += (money + 10) / 10;
						money = 0;
					}
				}
			}
		}

		System.out.println(B + 1);
		sc.close();
	}
}