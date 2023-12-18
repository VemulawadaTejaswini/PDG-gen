import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static int lis(int[] a,int n){
		int[] dp=new int[n+1];
		Arrays.fill(dp,Integer.MAX_VALUE);
		dp[0]=-1;
		for(int i=0;i<n;i++){
			int k=Arrays.binarySearch(dp,a[i]);
			if(k<0){
				k=-(k+1);
				dp[k]=Math.min(dp[k],a[i]);
			}
		}
		for(int i=n;i>=0;i--) if(dp[i]<Integer.MAX_VALUE) return i;
		return 0;
	}
	static int lds(int[] A, int N) {
		int[] dp = new int[N + 1];
		Arrays.fill(dp, -1);
		dp[0] = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			int k = bin_search(dp, A[i]);
			if(k < 0) k = -k;
			if(dp[k] == A[i]) {
				k++;
				dp[k] = Math.max(dp[k], A[i]);
			}
			else dp[k] = Math.max(dp[k], A[i]);
		}
		for(int i = N; i >= 0; i--) if(dp[i] >= 0) return i;
		return 0;
	}
	static int bin_search(int[] A, int key) {
		int min = 0, max = A.length - 1;
		while(max - min > 1) {
			int mid = (max + min) / 2;
			if(A[mid] < key) {
				max = mid;
			}else {
				min = mid;
			}
		}
		return (A[max] == key) ? max : -max;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt();
		System.out.println(lds(A, N));
	}
}