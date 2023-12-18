import java.util.*;

class Main {
	Scanner sc;

	void calc() {
		sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println(r*r);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}