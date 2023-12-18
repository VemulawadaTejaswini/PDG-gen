import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] town = new int[5];

		for(int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			town[a]++;
			town[b]++;
		}

		for(int i = 1; i <= 4; i++) {
			if(town[i] > 2) {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
	}
}