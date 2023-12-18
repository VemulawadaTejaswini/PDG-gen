import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;

		for (int i = 1; i <= n; i++) {
			if (String.valueOf(i).contains("0") || String.valueOf(i).contains("1") || String.valueOf(i).contains("2")
					|| String.valueOf(i).contains("4") || String.valueOf(i).contains("6")
					|| String.valueOf(i).contains("8") || String.valueOf(i).contains("9")) {
				continue;
			}
			if (String.valueOf(i).contains("3") && String.valueOf(i).contains("5") && String.valueOf(i).contains("7")) {
				ans++;
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
