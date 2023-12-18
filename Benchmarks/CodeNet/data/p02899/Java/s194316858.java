import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Num[] = new int[N + 1];
		Num[0] = 0;
		int x = 0;
		for (int i = 1; i < N + 1; i++) {
			x = scanner.nextInt();
			Num[x] = i;
		}
		for (int j = 1; j < N + 1; j++) {
			System.out.println(Num[j]);
		}
	}
}
