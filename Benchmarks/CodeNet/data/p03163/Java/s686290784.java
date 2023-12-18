import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int W = in.nextInt();
		int[] weight = new int[n];
		int[] value = new int[n];
		for(int i=0;i<n;i++){
			weight[i]=in.nextInt();
			value[i]=in.nextInt();
		}

		long[][] arr = new long[n+1][W+1];

		for(int i =0;i<=n;i++){
			for(int j=0;j<=W;j++){
				if(i==0||j==0) arr[i][j]=0;
				else if(j-weight[i-1]>=0) arr[i][j] = Math.max(arr[i-1][j],arr[i-1][j-weight[i-1]] + value[i-1]);
				else arr[i][j] =arr[i-1][j];
			}
		}
		System.out.println(arr[n][W]);
	}
}