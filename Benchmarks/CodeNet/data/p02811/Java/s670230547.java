import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		if (500*K >= X) System.out.println("Yes");
		else System.out.println("No");
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}