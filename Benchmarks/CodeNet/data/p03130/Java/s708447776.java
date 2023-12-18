import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);

		int[] c = new int[4];

		for (int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			c[a - 1]++;
			c[b - 1]++;
		}

		boolean isPath = true;

		for (int n : c) {
			if (n < 1 || n >= 3) {
				isPath = false;
				break;
			}
		}

		System.out.println(isPath ? "YES" : "NO");
		sc.close();
	}

}
