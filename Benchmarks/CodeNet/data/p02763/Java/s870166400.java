import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[] s=sc.next().toCharArray();
		int q=sc.nextInt();
		SegTree st=new SegTree(n);
		for(int i=0; i<n; i++){
			st.set(i,s[i]-'a');
		}
		for(int i=0; i<q; i++){
			int a=sc.nextInt();
			if(a==1){
				int b=sc.nextInt()-1;
				char c=sc.next().charAt(0);
				st.set(b,c-'a');
			}else{
				int b=sc.nextInt()-1;
				int c=sc.nextInt();
				System.out.println(Integer.bitCount(st.query(b,c)));
			}
		}
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
			v[k]=1<<val;
			while(k>0) {
				k=(k-1)/2;
				v[k]=v[2*k+1]|v[2*k+2];
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
				return vl|vr;
			}
		}
	}
}
