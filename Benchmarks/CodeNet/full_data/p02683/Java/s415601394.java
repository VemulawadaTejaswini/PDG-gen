import java.util.Scanner;

public class Main {
	public static int n, m, x;
	public static int[] c;
	public static int[][] a;
	public static boolean[] b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		x = sc.nextInt();
		c = new int[n];
		a = new int[n][m];
		for(int i = 0; i < n; i++){
			c[i] = sc.nextInt();
			for(int j = 0; j < m; j++){
				a[i][j] = sc.nextInt();
			}
		}
		b = new boolean[n];
		int min = search(0);
		if(min == Integer.MAX_VALUE){
			System.out.println(-1);
		} else {
			System.out.println(min);
		}
	}
	public static int search(int idx){
		if(idx == n){
			return calc();
		}
		int ret = Integer.MAX_VALUE;
		b[idx] = true;
		ret = Math.min(ret, search(idx+1));
		b[idx] = false;
		ret = Math.min(ret, search(idx+1));
		return ret;
	}
	public static int calc(){
		int ret = 0;
		int[] sum = new int[m];
		for(int i = 0; i < n; i++){
			if(!b[i])continue;
			ret += c[i];
			for(int j = 0; j < m; j++){
				sum[j] += a[i][j];
			}
		}
		for(int i = 0; i < m; i++){
			if(sum[i] < x)return Integer.MAX_VALUE;
		}
		return ret;
	}
}