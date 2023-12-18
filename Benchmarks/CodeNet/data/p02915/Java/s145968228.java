import java.util.*;

class Main {
	Scanner sc;
	int N;

	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		N = sc.nextInt();
		System.out.println(N*N*N);
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}