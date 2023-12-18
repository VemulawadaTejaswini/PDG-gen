import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] t = new int[4];

		for (int i = 0; i < 6; i++) {
			t[sc.nextInt() - 1]++;
		}

		for (int i = 0; i < t.length; i++) {
			if (t[i] >= 3) {
				System.out.println("NO");
				sc.close();
				return;
			}
		}
		System.out.println("YES");
		sc.close();
	}

}