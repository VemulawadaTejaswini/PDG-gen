import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n;
	static int m;
	static int x;
	static int[][] a ;
	static int min = 999999;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt() + 1;
		x = sc.nextInt();
		a = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int[] z = new int[m];
		Arrays.fill(z, 0);
		calc(0,z);
		if(min==999999) {
			System.out.println(-1);
		} else {
			System.out.println(min);
		}
		
	}
	
	public static void calc(int i, int[] z) {
//		System.out.println("calc: int="+i);
		for(int j=1; j<m; j++) {
			if(z[j] < x) {
				break;
			}
			if(z[0] < min) {
				min = z[0];
			}
			if(j-1==m)
				return ;
		}
		
		if(i >= n) {
//			System.out.println("out");
			return ;
		}
		
		calc(i+1,z);
		int[] z2 = new int[m];
		for(int o=0; o<m;o++) {
			z2[o] = z[o]+a[i][o];
		}
		calc(i+1,z2);
	}
	
}
