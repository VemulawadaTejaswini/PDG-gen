import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int num;
	static int max;
	public static void main(String[] args) {
	
		while(true) {
			n = sc.nextInt();
			int ans = solve(n);
			if(ans!=-1) {
				System.out.println(ans);
			}else {
				return;
			}
		}
	}

	private static int solve(int N) {
		if(N==0) {
			return -1;
		}else {
			num = 0;
			int[] win = new int[N+1];
			int[] lose = new int[N+1];
			int[][] table = new int[N+1][N+1];
			Boolean B = false;
			max = N/2;
			int m = sc.nextInt();
			for(int i=0;i<m;i++) {
				int w = sc.nextInt();
				int l = sc.nextInt();
				table[w][l] = 1;
				table[l][w] = -1;
				win[w]++;
				lose[l]++;
				if(win[w]>max||lose[l]>max) {
					B = true;
				}
			}
			if(B) {
				return 0;
			}
			check(win,lose,table,1,2);
			return num;
			
		}
		
	}

	private static void check(int[] ws, int[] ls, int[][] tb,int a,int b) {
		if(a==n-1&&b==n) {
			num++;
		}else {
			if(tb[a][b]!=0) {
				if(b!=n) {
					check(ws,ls,tb,a,b+1);
				}else {
					check(ws,ls,tb,a+1,a+2);
				}
				
			}else {
				if(ws[a]<max&&ls[b]<max) {
					ws[a]++;
					ls[b]++;
					if(b!=n) {
						check(ws,ls,tb,a,b+1);
					}else {
						check(ws,ls,tb,a+1,a+2);
					}
					ws[a]--;
					ls[b]--;
				}
				if(ws[b]<max&&ls[a]<max) {
					ws[b]++;
					ls[a]++;
					if(b!=n) {
						check(ws,ls,tb,a,b+1);
					}else {
						check(ws,ls,tb,a+1,a+2);
					}
					ws[b]--;
					ls[a]--;
				}
			}
				
		}
		
		
	}
	 
}
