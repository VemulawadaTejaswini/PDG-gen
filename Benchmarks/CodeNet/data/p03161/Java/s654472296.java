
import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	static int[] inputArray(int size){
		int arr[] = new int[size];
		for(int i=0;i<size;i++)arr[i]=sc.nextInt();
		return arr;
	}
	public static void main(String[] args){
		int size = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = inputArray(size);
		if(k>=size){System.out.println(0);System.exit(0);}
		int dp[] = new int[arr.length];
		dp[0]=0;
		for(int i=1;i<=k;i++){
			dp[i]=(int)Math.abs(arr[i]-arr[0]);
		}
		for(int i=k+1;i<arr.length;i++){
			int min=Integer.MAX_VALUE;
			//System.out.println("HAAAA");
			for(int j=i-1;j>=1;j--){
				min = Math.min(min,dp[j]+(int)Math.abs(arr[i]-arr[j]));
			}
			dp[i]=min;
		}
		System.out.println(Arrays.toString(dp));
		System.out.println(dp[arr.length-1]);
	}
}