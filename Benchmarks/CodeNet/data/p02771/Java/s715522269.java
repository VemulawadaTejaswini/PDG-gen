import java.util.*;

class Main {
	Scanner sc;
	int A, B, C;
	
	private void calc() {
		sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		if ((A == B && A != C) ||
			(B == C && B != A) ||
			(C == A && C != B)) System.out.println("Yes");
		else System.out.println("No");
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
