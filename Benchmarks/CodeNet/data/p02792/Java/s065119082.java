import java.util.*;

class Main {
	Scanner sc;
	int N, L, R, M, D;
	static final int[] P10;
	static {
		P10 = new int[10];
		P10[0] = 1;
		for (int i = 1; i < 10; i++) P10[i] = P10[i-1]*10;
	}
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		String sn = String.valueOf(N);
		D = sn.length();
		L = sn.charAt(0) - '0';
		R = N%10;
		M = (D==1)?0:Integer.parseInt(sn.substring(1))/10;
		
		int sum = 0;
		for (int a = 1; a < 10; a++) {
			int c = count(a, a);
			sum += c * c;
			for (int b = a+1; b < 10; b++) {
				sum += 2 * count(a, b) * count(b, a);
			}
		}
		
		System.out.println(sum);
	}
	
	private int count(int a, int b) {
		int c = 0;
		if (a == b && a <= N) c++;
		for (int d = 2; d < D; d++) c += P10[d-2];
		if (D >= 2) {
			if (a < L) {
				c += P10[D-2];
			} else if (a == L) {
				if (b > R) c += M;
				else c += M+1;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
