import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt5 = 0;
		int cnt7 = 0;

		for (int i = 0; i < 3; i++) {
			int tmp = sc.nextInt();
			if (tmp == 5)
				cnt5++;
			if (tmp == 7)
				cnt7++;
		}

		String ans = cnt5 == 2 && cnt7 == 1 ? "YES" : "NO";
		System.out.println(ans);

		sc.close();
	}
}
