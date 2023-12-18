import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ABC060BSolver solver = new ABC060BSolver();
		solver.main();
	}
}

class ABC060BSolver {
	
	int A;
	int B;
	int C;
	
	public ABC060BSolver() {
		Scanner cin = new Scanner(System.in);
		this.A = cin.nextInt();
		this.B = cin.nextInt();
		this.C = cin.nextInt();
	}
	
	void main() {
		for (int i = 1; i <= B; i++) {
			if (A*i % B == C) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}