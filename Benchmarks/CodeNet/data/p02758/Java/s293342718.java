import java.util.*;
import java.io.PrintWriter;
public class Main{
	static int[][] xd;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long mod=998244353;
		xd=new int[n][2];
		SegTree st=new SegTree(n);
		for(int i=0; i<n; i++){
			xd[i][0]=sc.nextInt();
			xd[i][1]=sc.nextInt();
		}
		Arrays.sort(xd,(x,y)->(x[0]-y[0]));
		int[] max=new int[n];
		for(int i=n-1; i>=0; i--){
			int idx=bs(i,n,xd[i][0]+xd[i][1]-1);
			max[i]=Math.max(i,st.query(i+1,idx+1));
			st.set(i,max[i]);
		}
		long[] dp=new long[n+1];
		dp[n]=1;
		dp[n-1]=2;
		for(int i=n-2; i>=0; i--){
			dp[i]+=dp[i+1]+dp[max[i]+1];
			dp[i]%=mod;
		}
		System.out.println(dp[0]);
	}
	static int bs(int left,int right,int dis){
		int l=left;
		int r=right;
		while(r-l>1){
			int m=(r+l)/2;
			if(xd[m][0]<=dis){
				l=m;
			}else{
				r=m;
			}
		}
		return l;
	}
	static class SegTree{
		int n=1;
		int[] v;
		
		public SegTree(int n) {
			while(this.n<n)this.n*=2;
			v=new int[2*this.n-1];
		}
		
		void set(int k,int val) {
			k+=n-1;
			v[k]=val;
			while(k>0) {
				k=(k-1)/2;
				v[k]=Math.max(v[2*k+1],v[2*k+2]);
			}
		}
		
		int query(int a,int b) {
			return query(0,n,a,b,0);
		}
		
		int query(int l,int r,int a,int b,int k) {
			if(r<=a||b<=l)return 0;
			else if(a<=l&&r<=b)return v[k];
			else {
				int vl=query(l,(l+r)/2,a,b,2*k+1);
				int vr=query((l+r)/2,r,a,b,2*k+2);
				return Math.max(vl,vr);
			}
		}
	}
}
