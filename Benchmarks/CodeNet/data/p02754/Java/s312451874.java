import java.util.*;

class Main {
	Scanner sc;
	long N, A, B;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextLong();
		A = sc.nextLong();
		B = sc.nextLong();
		
		long c = N/(A+B)*A+Math.min(N%(A+B), A);
		System.out.println(c);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
