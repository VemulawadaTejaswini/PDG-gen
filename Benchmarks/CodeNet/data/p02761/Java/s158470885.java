import java.util.*;

class Main {
	Scanner sc;
	int N, M;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		int[] s = new int[M];
		int[] c = new int[M];
		for (int i = 0; i < M; i++) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		int i = 0;
	lp:
		for (; i < 1000; i++) {
			String n = String.valueOf(i);
			if (n.length() != N) continue;
			for (int j = 0; j < M; j++) {
				if ( (n.charAt(s[j]-1) - '0') != c[j]) continue lp;
			}
			break;
		}
		if (i == 1000) System.out.println(-1);
		else System.out.println(i);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
