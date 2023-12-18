import java.util.Scanner;
import java.lang.Math;

public class Main {
	static void update(long tree[], long val, int start, int end, int idx, int pos)
	{
		if(start == end)
		{
			tree[idx] = val;
		}
		else
		{
			int mid = (start + end)/2;
			if(pos>=start && pos<=mid) update(tree, val, start, mid, 2*idx+1, pos);
			else update(tree, val, mid+1, end, 2*idx+2, pos);
			tree[idx] = Math.max(tree[2*idx+1] , tree[2*idx+2]);
		}
	}
	
	static long query(long tree[], int start, int end, int l,int r, int idx) {
		if(start>=l && end<=r) return tree[idx];
		if(start>r || end<l) return -1;
		int mid = (start+end)/2;
		return Math.max(query(tree,start,mid,l,r,2*idx+1),query(tree,mid+1,end,l,r,2*idx+2));
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		long[] tree = new long[4000000];
		long[] dp = new long[200000];
		int n = in.nextInt();
		for(int i=0;i<n+1;i++) dp[i]=0;
		int[] h = new int[n];
		long[] a = new long[n];
		for(int i=0;i<n;i++)
		{
			h[i] = in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			a[i] = in.nextLong();
		}
		for(int i=0;i<n;i++)
		{
			//System.out.print(query(tree, 0, n, 0, h[i], 0)+" ");
			dp[h[i]] = Math.max(dp[h[i]], a[i] + query(tree, 0, n, 0, h[i], 0));
			update(tree, dp[h[i]], 0, n, 0, h[i]);
		}
//		update(tree, 10, 0, 2*n+1, 0, 3);
//		update(tree, 20, 0, 2*n+1, 0, 1);
//		for(int i=0;i<2*n+1;i++)
//		{
//			System.out.print(tree[i]+" ");
//		}
//		System.out.print(query(tree, 0, 2*n+1, 0, 2, 0)+" ");
		long ans = 0;
//		for(int i=0;i<=n;i++) System.out.print(dp[i]+" ");
		for(int i=0;i<=n;i++) ans = Math.max(ans, dp[i]);
		System.out.print(ans);
	}
}
