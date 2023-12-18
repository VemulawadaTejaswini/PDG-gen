import java.util.Scanner;

public class Main {

	private int gcd(int a, int b) {
		if (a > b) {
			int tmp = b;
			b = a;
			a = tmp;
		}
		// a <= b
		while (b % a != 0) {
			int oldA = a;
			a = b % a;
			b = oldA;
		}
		
		return a;
		
	}
	
	public int solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] Ai = new int[N];
		for (int i=0; i<N; i++) {
			Ai[i] = in.nextInt();
		}
		in.close();
		
		int ret = Ai[0];
		for (int i=1; i<N; i++) {
			ret = gcd(ret, Ai[i]);
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main.solve());
	}
}