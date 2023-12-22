import java.util.Arrays;
import java.util.Scanner;

//Bara-Bara Manju
public class Main{
	
	byte[][][][] dp = new byte[101][101][101][101];
	
	int[][] f1 = {{1,0,2,1,3,5},{0,1,0,2,4},{0,1,3},{0,2}};
	int[][] f2 = {{0,1,0,2,1,0},{0,0,2,1,0},{0,1,0},{1,0}};
	int[][] f3 = {{0,1,1,0,0,0},{0,1,0,0,0},{1,0,0},{0,0}};
	int[][] f4 = {{1,0,0,0,0,0},{1,0,0,0,0},{0,0,0},{0,0}};
	
	int res, num;
	int[] c;
	
	void f(int k){
		if(k==9)return;
		int n = f1[k-5].length;
		for(int i=0;i<n;i++)for(int u=0;u<=c[k];u++){
			int n1 = f1[k-5][i]*u, n2 = f2[k-5][i]*u, n3 = f3[k-5][i]*u, n4 = f4[k-5][i]*u;
			if(n1<=c[1] && n2<=c[2] && n3 <= c[3] && n4 <= c[4]){
				c[1]-=n1; c[2]-=n2; c[3]-=n3; c[4]-=n4;
				res = Math.max(res, num + dp[c[1]][c[2]][c[3]][c[4]] + u);
				f(k+1);
				c[1]+=n1; c[2]+=n2; c[3]+=n3; c[4]+=n4;
			}
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int[] n1 = {0, 2, 1, 3, 4, 6, 1, 0, 2, 4, 1, 3, 5, 7, 0, 2, 4, 6, 8, 10};
		int[] n2 = {1, 0, 1, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 0, 5, 4, 3, 2, 1, 0};
		int[] n3 = {0, 0, 1, 1, 0, 0, 3, 2, 2, 2, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0};
		int[] n4 = {2, 2, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for(int c1=0;c1<=100;c1++){
			for(int c2=0;c1+c2<=100;c2++){
				for(int c3=0;c1+c2+c3<=100;c3++){
					for(int c4=0;c1+c2+c3+c4<=100;c4++){
						for(int k=0;k<20;k++){
							if(c1>=n1[k] && c2>=n2[k] && c3>=n3[k] && c4>=n4[k]){
								dp[c1][c2][c3][c4] = (byte) Math.max(dp[c1][c2][c3][c4], dp[c1-n1[k]][c2-n2[k]][c3-n3[k]][c4-n4[k]]+1);
							}
						}
					}
				}
			}
		}
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			c = new int[11];
			for(int i=0;i<n;i++)c[sc.nextInt()]++;
			num = c[5]/2;
			c[5]%=2;
			for(int i=6;i<10;i++){
				int t = Math.min(c[i], c[10-i]);
				num+=t;
				c[i]-=t;
				c[10-i]-=t;
			}
			res = 0;
			f(5);
			System.out.println(res);
		}
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}