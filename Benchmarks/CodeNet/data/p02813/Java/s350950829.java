import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] P = new int[n];
		int[] Q = new int[n];

		int p = 0;
		int q = 0;
		int count = 0;

		for(int i = 0; i < n; i++) {
			P[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			Q[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			if(!isMin(P, i)) {
				count += (P[i] - 1 - i) * factorial(P.length - (i+1));
			}
		}
		count += factorial(P.length - 2);

		p = count;
		count = 0;

		for(int i = 0; i < n; i++) {
			if(!isMin(Q, i)) {
				count += (Q[i] - 1 - i) * factorial(Q.length - (i+1));
			}
		}
		count += factorial(Q.length - 2);

		q = count;
		count = 0;

		System.out.println(Math.abs(p - q));
		sc.close();
	}

	public static int factorial(int n) {
		if(n > 1) {
			return factorial(n - 1) * n;
		}else {
			return n;
		}
	}

	public static boolean isMin(int[] list, int i) {
		for(int n = i + 1; n < list.length; n++) {
			if(list[i] > list[n]) {
				return false;
			}
		}
		return true;
	}
}