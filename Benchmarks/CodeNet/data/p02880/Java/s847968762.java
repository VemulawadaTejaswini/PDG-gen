import java.util.*;

class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		int N = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			if (N%i==0 && (N/i)<10) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}