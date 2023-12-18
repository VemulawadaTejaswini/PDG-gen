import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println(frog1(arr));
		
		
	}
	public static int frog1(int[] heights) {
		
		int[] dp=new int[heights.length];
		dp[0]=0;
		dp[1]=Math.abs(heights[0]-heights[1]);
		for(int vidx=2;vidx<heights.length;vidx++) {
		
		
		dp[vidx]=Math.min(Math.abs(heights[vidx]-heights[vidx-1])+dp[vidx-1], Math.abs(heights[vidx]-heights[vidx-2])+dp[vidx-2]);
			
		}
		int len=heights.length;
		return dp[len-1];
			
	}

}
