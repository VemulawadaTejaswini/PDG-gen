import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int Y = s.nextInt();

		int hideyo = 0;
		int ichiyo = 0;
		int yukichi = 0;
		int count = 0;

		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N; j++) {
				for (int k = 0; k <= N; k++) {
					if (i + j + k <= N) {
						if (i * 1000 + j * 5000 + k * 10000 == Y) {
							count++;
							hideyo = i;
							ichiyo = j;
							yukichi = k;
						}
					}
				}
			}
		}
		if (count == 0) {
			System.out.println("-1 -1 -1");
		} else {
			System.out.println(yukichi + " " + ichiyo + " " + hideyo);
		}
	}
}
