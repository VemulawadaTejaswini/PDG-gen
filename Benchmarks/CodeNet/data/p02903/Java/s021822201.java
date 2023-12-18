import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < w; j++) {
			if (j < a) {
				sb.append(1);
			} else {
				sb.append(0);
			}
		}
		for (int i = 0; i < b; i++) {
			System.out.println(sb.toString());
		}

		sb = new StringBuilder();
		for (int j = 0; j < w; j++) {
			if (j < a) {
				sb.append(0);
			} else {
				sb.append(1);
			}
		}
		for (int i = 0; i < h - b; i++) {
			System.out.println(sb.toString());
		}
	}
}
