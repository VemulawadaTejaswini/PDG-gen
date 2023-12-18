import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no1();
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			Integer N = sc.nextInt();
			Integer a = sc.nextInt();
			Integer b = sc.nextInt();

			int ans = 0;
			for (int i = 1; i <= N; i++) {
				String str = String.valueOf(i);
				char[] ch = str.toCharArray();

				int sum = 0;
				for (int j = 0; j < ch.length; j++) {
					sum += Character.getNumericValue(ch[j]);
				}
				if (a <= sum && sum <= b) {
					ans += i;
				}
			}
			System.out.println(ans);
		}
	}
}
