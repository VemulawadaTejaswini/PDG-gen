import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		// 外側のループの時点でオーダーが10^81だから逆立ちしても無理
		int totalBeauty = 0;
		for (int i = 0; i <= Math.pow(n, m); i++) {
			int tmp = i;
			int butyCnt = 0;
			int prevNum = tmp % n;
			tmp /= n;
			for (int j = 1; j < m; j++) {
				int curNum = tmp % n;
				tmp /= n;
				int difNum = Math.abs(prevNum - curNum);
				if (difNum == d) {
					butyCnt++;
				}
			}
			totalBeauty += butyCnt;
		}
		System.out.println((0.0 + totalBeauty) / Math.pow(n, m));
	}
}
