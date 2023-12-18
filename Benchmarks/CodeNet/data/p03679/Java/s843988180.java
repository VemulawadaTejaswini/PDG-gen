import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve1();
	}

	private void solve1() {

		Scanner sc = new Scanner(System.in);

		// X日まで過ぎた食品を食べてもお腹を壊しません
		// X + 1日以上過ぎた食品を食べると、お腹を壊します

		// 賞味期限のA日前
		int A = sc.nextInt();
		// 買ってから食べた日B
		int B = sc.nextInt();
		// 賞味期限を過ぎた日数X
		int X = sc.nextInt();

		if (A - B > 0){
			System.out.println("delicious");
		} else if (B > (A + X)) {
			System.out.println("safe");
		} else {
			System.out.println("dangerous");
		}


		System.out.println();
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		String X = sc.nextLine();
		String[] TEST = X.split(" ", 0);
		int N = Integer.parseInt(TEST[0]);
		int A = Integer.parseInt(TEST[1]);
		int B = Integer.parseInt(TEST[2]);

		if (N * A <= B) {
			System.out.println(A * N);
		} else {
			System.out.println(B);
		}
	}

	private void solveB() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		sc.nextLine();
		int N2 = sc.nextInt();
		int N3 = sc.nextInt();

		System.out.println(N1);
		System.out.println(N2);
		System.out.println(N3);

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