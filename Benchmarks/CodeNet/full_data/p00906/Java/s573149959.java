import java.util.*;

public class Main{
	int m;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			m = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int t = sc.nextInt();
			if((n|m|a|b|c|t) == 0){
				break;
			}
			int [][] s = new int[n][1];
			for(int i = 0; i < n; i++){
				s[i][0] = sc.nextInt();
			}
			int [][] mat = new int[n][n];
			for(int i = 0; i < n; i++){
				if(i - 1 >= 0){
					mat[i][i - 1] = a;
				}
				mat[i][i] = b;
				if(i + 1 < n){
					mat[i][i + 1] = c;
				}
			}

			int [][] matrixpowmat = matrixPow(mat, t);
			int [][] ans = mul(matrixpowmat, s);
			for(int i = 0; i < n-1; i++){
				System.out.print(ans[i][0] + " ");
			}
			System.out.println(ans[n-1][0]);
		}
	}

	private int[][] matrixPow(int[][] a, int n) {
		int [][] b = new int [a.length][a[0].length];
		for(int i = 0; i < a.length; i++){
			b[i][i] = 1;
		}
		while(n > 0){
			if((n & 1) != 0){
				b = mul(b,a);
			}
			a = mul(a,a);
			n >>= 1;
		}
		return b;
	}

	private int[][] mul(int[][] a, int[][] b) {
		int [][] c = new int[a.length][b[0].length];
		for(int i = 0; i < a.length; i++){
			for(int k = 0; k < b.length; k++){
				for(int j = 0; j < b[0].length; j++){
					c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % m;
				}
			}
		}
		return c;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}