import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] dp=new long[n];
		int[] h=new int[n];
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			h[i]=sc.nextInt()-1;
		}
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		SegTree st=new SegTree(n);
		long ans=0;
		for(int i=0; i<n; i++){
			dp[i]=a[i]+st.query(0,h[i]+1);
			ans=Math.max(ans,dp[i]);
			st.set(h[i],dp[i]);
		}
		
		System.out.println(ans);
	}
	static class SegTree{
		int n=1;
		long[] v;
		
		public SegTree(int n) {
			while(this.n<n)this.n*=2;
			v=new long[2*this.n-1];
		}
		
		void set(int k,long val) {
			k+=n-1;
			v[k]=val;
			while(k>0) {
				k=(k-1)/2;
				v[k]=Math.max(v[2*k+1],v[2*k+2]);
			}
		}
		//bをプラス1
		long query(int a,int b) {
			return query(0,n,a,b,0);
		}
		
		long query(int l,int r,int a,int b,int k) {
			if(r<=a||b<=l)return 0;
			else if(a<=l&&r<=b)return v[k];
			else {
				long vl=query(l,(l+r)/2,a,b,2*k+1);
				long vr=query((l+r)/2,r,a,b,2*k+2);
				return Math.max(vl,vr);
			}
		}
	}
}