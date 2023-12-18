import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calc c = new Calc();
		c.abc119C();
	}
}

class Calc{
	int N,A,B,C,INF=(int)Math.pow(10, 9);
	int[] L;
	void abc119C() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		L = new int[N];
		for(int i=0 ; i < N ; i++) {
			L[i] = sc.nextInt();
		}
		System.out.println( dfs(0,0,0,0) );
	}
	
	int dfs(int i, int a, int b, int c) {
		if(i == N) {
			if(a>0 && b>0 && c>0) {
				return Math.abs(a-A) + Math.abs(b-B) + Math.abs(c-C) - 30;
			}else {
				return INF;
			}
		}
		int ret0 = dfs(i+1, a, b, c);
		int ret1 = dfs(i+1, a+L[i], b, c) + 10;
		int ret2 = dfs(i+1, a, b+L[i], c) + 10;
		int ret3 = dfs(i+1, a, b, c+L[i]) + 10;
		return Math.min(Math.min(Math.min(ret0, ret1), ret2), ret3);
	}
}