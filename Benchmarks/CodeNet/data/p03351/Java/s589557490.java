import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// aさんの位置情報
		int a = sc.nextInt();
		// bさんの位置情報
		int b = sc.nextInt();
		// cさんの位置情報
		int c = sc.nextInt();
		// 会話ができる距離を取得。
		int talkDistance = sc.nextInt();

		// aさんとcさんの距離を調べる。
		if (a > c) {
			if ((a - c) <= talkDistance) {
				System.out.println("Yes");
			} else {
				// bさんとの中継ができるか
				if (a > b) {
					if ((a - b) <= talkDistance) {
						if (c > b) {
							if ((c - b) <= talkDistance) {
								System.out.println("Yes");
							} else {
								System.out.println("No");
							}
						} else if ((b - c) <= talkDistance) {
							System.out.println("Yes");
						} else {
							System.out.println("No");
						}
					} else {
						System.out.println("No");

					}
				} else {
					if ((b - a) <= talkDistance) {
						if (c > b) {
							if ((c - b) <= talkDistance) {
								System.out.println("Yes");
							} else {
								System.out.println("No");
							}
						}
					} else {
						System.out.println("No");
					}
				}
			}
		}

	}
}