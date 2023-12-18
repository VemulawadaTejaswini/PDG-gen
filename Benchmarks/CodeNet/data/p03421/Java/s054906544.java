import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sq = (int)Math.sqrt((double)N);
		if((A+B>N+1) || (A<sq && B<sq)) System.out.println(-1);
		else if(A+B==N+1){
			for(int i=B;i<=N;++i) System.out.print(i+" ");
			for(int i=B-1;i>=1;--i) System.out.print(i+" ");
			System.out.println();
		}else{
			int[] a = new int[N];
			int count = 0;
			for(int i=1;i<=N/B;i++){
				for(int j=i*B;j>(i-1)*B;j--){
					a[count] = j;
					count++;
				}
			}
			for(int j=N;j>B*(N/B);--j){
				a[count] = j;
				count++;
			}
			
			int[] dp = new int[N];
			int zouka = 0;
			for (int i=0;i<N;i++){
			      dp[i] = 1;
			      for (int j=0; j<i; j++) {
			        if (a[i] > a[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
			      }
			      zouka = Math.max(zouka, dp[i]);
			}
			
			if(zouka != A) System.out.println(-1);
			else{
				for(int i=0;i<N;++i) System.out.print(a[i]+" ");
				System.out.println();
			}
		}
		return;
	}
}