import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ABC057CCSolve solve = new ABC057CCSolve();
		solve.main();
	}
}

class ABC057CCSolve {
	
	long N;
	
	ABC057CCSolve() {
		Scanner cin = new Scanner(System.in);
		this.N = cin.nextLong();
	}
	
	void main() {
		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= Math.sqrt(N); i++) {
			if (N % i != 0) continue;
						
			long a = i;
			long b = N / a;
			min = Math.min(min, F(a, b));
		}
		System.out.println(min);
	}
	
	int F(long A, long B) {
		return Math.min(String.valueOf(B).length(), String.valueOf(B).length());
	}
	
}
