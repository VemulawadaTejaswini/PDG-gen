
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveC();
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int NA = N * A;

		if (NA > B) {
			System.out.println(B);
		} else {
			System.out.println(NA);
		}
	}

	private void solveB() {
		Scanner sc = new Scanner(System.in);

		String N = sc.nextLine();

		int iN = Integer.parseInt(N);

		String[] str = N.split("");

		int I = 0;
		for (int i = 0; i < str.length; i++) {
			int I2 = Integer.parseInt(str[i]);
			I += I2;
		}
		if (iN % I == 0) {
			System.out.println("Yes");
		} else if (iN % I != 0) {
			System.out.println("No");
		}

	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int KX = K * X;
		int KY = (K+1) * Y;

		if(N <= K){
			System.out.println(KX);
		}else{
			System.out.println(KY);
		}
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