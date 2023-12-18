import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if (a == 0) {
			for (int i = 0; i < h; i++) {
				if (i < b) {
					StringBuilder sb = new StringBuilder();
					for (int j = 0; j < w; j++) {
						sb.append(1);
					}
					System.out.println(sb.toString());
				} else {
					StringBuilder sb = new StringBuilder();
					for (int j = 0; j < w; j++) {
						sb.append(0);
					}
					System.out.println(sb.toString());
				}
			}
		} else if (b == 0) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < w; j++) {
				if (j < a) {
					sb.append(1);
				} else {
					sb.append(0);
				}
			}
			for (int i = 0; i < h; i++) {
				System.out.println(sb.toString());
			}
		} else if (h * a == w * b) {
			if (h % b == 0) {
				int x = h / b;
				for (int k = 0; k < b; k++) {
					for (int i = 0; i < x; i++) {
						StringBuilder sb = new StringBuilder();
						for (int j = 0; j < w; j++) {
							if (j / a == i) {
								sb.append(1);
							} else {
								sb.append(0);
							}
						}
						System.out.println(sb.toString());
					}
				}
			} else {
				for (int i = 0; i < h; i++) {
					int start = i % w;
					int end = start + a;
					StringBuilder sb = new StringBuilder();
					for (int j = 0; j < w; j++) {
						if (w <= end && j < end % w || start <= j && j < end) {
							sb.append(1);
						} else {
							sb.append(0);
						}
					}
					System.out.println(sb.toString());
				}
			}
		} else {
			System.out.println("No");
		}
	}
}
