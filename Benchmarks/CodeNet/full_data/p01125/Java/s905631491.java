
import java.util.Scanner;


public class Main {
	static int[][] f = new int[21][21];
	static String ans = "Yes";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0)break;
			
			for(int i=0;i<=20;i++) {
				for(int j=0;j<=20;j++)
					f[i][j] = 0;
			}
			
			for(int i=0;i<n;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				f[x][y] = 1;
			}
			
			int cnt = 0;
			int m = sc.nextInt();
			int x=10;
			int y=10;
			for(int i=0;i<m;i++) {
				char a = sc.next().charAt(0);
				int d = sc.nextInt();
				switch(a) {
				case 'N':
					for(int k=y;k<=y+d;k++) {
						if(f[x][k] == 1) {
							cnt++;
							f[x][k] = 0;
						}
					}
					y += d;
					break;
				case 'E':
					for(int k=x;k<=x+d;k++) {
						if(f[k][y] == 1) {
							cnt++;
							f[k][y] = 0;
						}
					}
					x += d;
					break;
				case 'S':
					for(int k=y;k>=y-d;k--) {
						if(f[x][k] == 1) {
							cnt++;
							f[x][k] =0;
						}
					}
					y -= d;
					break;
				case 'W':
					for(int k=x;k>=x-d;k--) {
						if(f[k][y] == 1) {
							cnt++;
							f[k][y] =0;
						}
					}
					x -= d;
					break;
				}
			}
			
			if(cnt != n)ans = "No";
			System.out.println(ans);
		}
		
	}
}
