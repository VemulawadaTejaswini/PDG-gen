import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int oddCount = 0;
		for (int i = 0; i < N; i++) {
			if (sc.nextInt() % 2 != 0) {
				oddCount++;
			}
		}
		System.out.println(oddCount % 2 == 0 ? "YES" : "NO");
		sc.close();
	}
}