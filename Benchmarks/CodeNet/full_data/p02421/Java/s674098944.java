import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int a = sc.nextInt();
			int t = 0;
			int h = 0;

			for (int i = 0; i < a; i++) {
				String taro = sc.next();
				String hana = sc.next();

				if (taro.compareTo(hana) > 0) {
					t += 3;
				} else if (hana.compareTo(taro) > 0) {
					h += 3;
				} else {
					t += 1;
					h += 1;
				}
			}
			System.out.println(t + " " + h);
		}
	}
}
