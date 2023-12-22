import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	static int[] daruma;
	static int[][] memo;
	static int max(int i, int j) {//番目
		if(memo[i][j]==-1) {
			int n=j-i;
			if(n==1) {
				memo[i][j]=0;
			}//個数が1個の時
			else if(n==2) {
				assert(j-1==i+1);
				memo[i][j]=(Math.abs(daruma[i]-daruma[i+1])<=1)? 2:0;
			}//個数が2個の時
			else {
				int lmax=0;
				if(n>=4) {//両端のやつが消せるかどうか
					lmax=max(i+1, j-1);
					lmax+=(lmax==n-2)?(Math.abs(daruma[i]-daruma[j-1])<=1? 2:0):0;
				}//両端以外が消えていたら、両端が条件満たすとき加え、消えてないときは0
				for(int k=i+1; k+1<j; k++) {//二つのブロックにわけていく
					int top=max(i, k);
					int bot=max(k, j);
					if(lmax<top+bot) {
						lmax=top+bot;
					}
				}
				memo[i][j]=lmax;
			}
		}
		return memo[i][j];
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				daruma=new int[n];
				memo=new int[n][n+1];
				for(int i=0; i<n; i++) {
					daruma[i]=sc.nextInt();
					Arrays.fill(memo[i], -1);
				}
				System.out.println(max(0,n));
			}
		}
	}
}
