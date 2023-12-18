
import java.util.Scanner;

// *** at 2018/**/**

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveA081();
	}

	private void solveA081() {
		Scanner sc = new Scanner(System.in);
		char N[] = sc.nextLine().toCharArray();
		int cnt = 0;
		for (char c : N) cnt += c - '0';
		System.out.println(cnt);
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