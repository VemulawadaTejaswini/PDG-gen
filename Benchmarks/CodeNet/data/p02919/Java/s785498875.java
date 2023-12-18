import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[100004];
		p[0] = n;p[1] = n; p[n+2] =n; p[n+3] = n;
		for(int i=2;i<=n+1;i++) p[i] = sc.nextInt();//

		int[][] l = new int[n+4][n+4];//0で初期化。神
		for(int i=2;i<=n+1;i++) {
			for(int j=0;j<i;j++) {
				if(p[j]>p[i]) l[i][j] = 1;
			}
			for(int j = i+1; j<n+4; j++) {
				if(p[j]>p[i]) l[i][j] = 1;
			}
		}

		int ans = 0;
		for(int i=2; i<=n+1; i++) {
			int l1 = 1;
			int l2 = 1;
			int r1 = n+2;
			int r2 = n+2;

			for(int j=2;j<i;j++) {
				if(l[i][j]==1) {
					l2 = l1;
					l1 = j;
				}
			}
			for(int j=n+1; j>i; j--) {
				if(l[i][j]==1) {
					r2 = r1;
					r1 = j;
				}
			}
			ans += ((l1-l2)*(r1-i) + (i-l1)*(r2-r1)) * p[i];
			//System.out.println(p[i]+":"+((l1-l2)*(r1-i)+"+" + (i-l1)*(r2-r1))+"回");
		}
		System.out.println(ans);
	}
}