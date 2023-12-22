import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		for (int a = 0; a <= k; a++) {
			for (int b = 0; b <= k; b++) {
				for (int c = 0; c <= k; c++) {
					if (a + b + c == k) {
						int rr = (int) Math.pow(2, a) * R;
						int gg = (int) Math.pow(2, b) * G;
						int bb = (int) Math.pow(2, c) * B;
						if (gg > rr && bb > gg) {
							System.out.println("Yse");
							return;
						}
					}
				}
			}
		}
		System.out.println("No");
	}
}