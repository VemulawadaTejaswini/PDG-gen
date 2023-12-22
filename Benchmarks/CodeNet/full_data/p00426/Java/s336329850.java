import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	long[][][][] memo = new long[3][16][16][16];
	int[] cups;
	int n;
	
	long calcA(int a, int b,int c) {
		if (memo[0][a][b][c] == 0) {
			if (c == 0 && b == 0) {
				return 0;
			}
			if (b == 0 && a == 0) {
				return memo[0][a][b][c] = (long)(Math.pow(3, c)-1);
			}
			int mp = cups[n-a-b-c];
			if (mp == 2) {
				memo[0][a][b][c] = calcA(a, b, c-1) + calcC(a+b+c-1, 0, 0) + calcA(0, 0, a+b+c-1) + 2;
			} else if (mp == 1) {
				memo[0][a][b][c] = calcC(a, b-1, c) + calcA(0, 0, a+b+c-1) + 1;
			} else {
				memo[0][a][b][c] = calcA(a-1, b, c);
			}
		}
		return memo[0][a][b][c];
	}
	
	long calcB(int a, int b,int c) {
		if (memo[1][a][b][c] == 0) {
			if (a == 0 && c == 0) {
				return 0;
			}
			if ((a == 0 && b == 0) || (b == 0 && c == 0)) {
				return memo[1][a][b][c] = (long)(Math.pow(3, a+c)-3)/2 + 1;
			}
			int mp = cups[n-a-b-c];
			if (mp == 0) {
				memo[1][a][b][c] = calcC(a-1, b, c) + calcB(0, 0, a+b+c-1) + 1;
			} else if (mp == 1) {
				memo[1][a][b][c] = calcB(a, b-1, c);
			} else {
				memo[1][a][b][c] = calcA(a, b, c-1) + calcB(a+b+c-1, 0, 0) + 1;
			}
		}
		return memo[1][a][b][c];
	}
	
	long calcC(int a, int b, int c) {
		if (memo[2][a][b][c] == 0) {
			if (a == 0 && b == 0) {
				return 0;
			}
			if (b == 0 && c == 0) {
				return memo[2][a][b][c] = (long)(Math.pow(3, a)-1);
			}
			int mp = cups[n-a-b-c];
			if (mp == 0) {
				memo[2][a][b][c] = calcC(a-1, b, c) + calcA(0, 0, a+b+c-1) + calcC(a+b+c-1, 0, 0) + 2;
			} else if (mp == 1) {
				memo[2][a][b][c] = calcA(a, b-1, c) + calcC(a+b+c-1, 0, 0) + 1;
			} else {
				memo[2][a][b][c] = calcC(a, b, c-1);
			}
		}
		return memo[2][a][b][c];
	}
	
	void run() {
		while (true) {
			n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0) break;
			
			cups = new int[n];
			int a = 0, b = 0, c = 0;
			for (int i = 0; i < 3; i++) {
				int num = sc.nextInt();
				if (i == 0) a = num;
				else if (i == 1) b = num;
				else c = num;
				for (int j = 0; j < num; j++) {
					cups[sc.nextInt()-1] = i;
				}
			}
			long res = Math.min(calcA(a, b, c), calcC(a, b, c));
			if (res <= m)
				out.println(res);
			else
				out.println(-1);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}