
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// ABC062
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveB();
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		List<Integer> a = Arrays.asList(0, 2, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0);
		if (a.get(x - 1) == a.get(y - 1)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private void solveB() {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int x = sc.nextInt();
		// 縦軸
		for (int i = 0; i < (y + 2); i++) {
			for (int j = 0; j < x + 2; j++) {
				if (i == 0 || i == y + 1) {
					System.out.print("#");
					if (j == x + 1) {
						System.out.println();
					}
				} else {
					String a = sc.nextLine();
					if (!a.equals("")) {
						System.out.println("#" + a + "#");
						break;
					}
				}
			}
		}
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveE() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveF() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

}