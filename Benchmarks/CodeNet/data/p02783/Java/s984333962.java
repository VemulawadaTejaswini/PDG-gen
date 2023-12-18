import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A = sc.nextInt();
		System.out.println((H+A-1)/A);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
