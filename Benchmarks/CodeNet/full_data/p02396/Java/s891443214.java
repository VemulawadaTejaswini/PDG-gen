import java.util.Scanner;

public class Main {
	public static int judge(int x) { // 1<=x<=10000
		if (1 <= x && x <= 10000) {
			return 0;
		} else if (x == 0) {
			return 1;
		} else {
			return 2;
		}
	}

	public static void main(String[] args) {
		int x;
		int i = 0;
		while (i < 10000) { // ?????§10000???
			i++;
			Scanner scan = new Scanner(System.in);
			x = scan.nextInt();
			if (judge(x) == 0) {
				System.out.println("Case " + i + ": " + x);
			} else if (judge(x) == 1) {
				break;
			} else if (judge(x) == 2) {
				System.out.println("??????1~10000,?????????0??§??\?????????????????????.???????????????.");
			}
		}

	}

}