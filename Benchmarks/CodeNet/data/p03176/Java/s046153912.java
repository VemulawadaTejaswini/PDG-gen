import java.util.*;
public class Main {
	static int n;
	static long[] bit=new long[212345];
	public static void update(int x,long v) {
		while (x<=n) {
			bit[x]=Math.max(bit[x],v);
			x+=x&-x;
		}
	}
	public static long query(int x) {
		long ret=0;
		while (x>0) {
			ret=Math.max(ret,bit[x]);
			x-=x&-x;
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int[] h=new int[n];
		int[] a=new int[n];
		for (int i=0;i<n;++i) h[i]=in.nextInt();
		for (int i=0;i<n;++i) a[i]=in.nextInt();
		long res=0;
		for (int i=0;i<n;++i) {
			long x=a[i]+query(h[i]-1);
			res=Math.max(res,x);
			update(h[i],x);
		}
		System.out.println(res);
	}
}