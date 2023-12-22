import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {

			boolean ans = false;
			int ansh = 0;
			int answ = 0;

			int h = scanner.nextInt();
			int w = scanner.nextInt();

			if (h == 0 && w == 0) {
				return;
			}

			int givenDia = h * h + w * w;

			//同じ対角線の長さのものを探す
			//				長方形の高さを一つづつ長くする
			for (int i = h + 1; i < w; i++) {
				int j = givenDia - i * i;

				//				同じ対角線の長さの長方形を探す
				for (int k = w - 1; k * k >= j; k--) {
					if (k * k == j && i < k) {

						ans = true;
						ansh = i;
						answ = k;
						break;
					}
				}

				if (ans == true) {
					break;
				}
			}
			if (ans != true) {

				//				対角線を1づつ長くして、整数の二乗で作れるものを探す
				for (int j = givenDia+1;; j++) {

					for (int l = 1; l * l < j / 2; l++) {
						double d = Math.sqrt(j - l * l);
						if (d == (int) d && !(l == h && d == w)) {
							ans = true;
							ansh = l;
							answ = (int) d;
							break;
						}

						if (ans == true) {
							break;
						}
					}
					if (ans == true) {
						break;
					}
				}
			}

			System.out.println(ansh + " " + answ);
		}
		scanner.close();
		return;
	}

}
