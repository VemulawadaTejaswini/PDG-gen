import java.util.*;
public class Main {
	public static class bitset {
		long[] a=new long[8];
		public void set(long v,int id) {
			a[id/50]|=v<<(id%50);
		}
		public int get(int id) {
			return (int)((a[id/50]>>(id%50))&1);
		}
		public void xor(bitset rhs) {
			for (int i=0;i<8;++i) a[i]^=rhs.a[i];
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		bitset[] bit=new bitset[n];
		for (int i=0;i<n;++i) {
			bit[i]=new bitset();
			for (int j=0;j<m;++j) {
				int x=in.nextInt();
				bit[i].set(x,j);
			}
		}
		long mod=998244353;
		long[] p=new long[n+m];
		p[0]=1;
		for (int i=1;i<n+m;++i) p[i]=(p[i-1]+p[i-1])%mod;
		int rk=0;
		for (int i=0;i<m;++i) {
			boolean flag=false;
			for (int j=i;j<n;++j) if (bit[j].get(i)==1) {
				bitset tmp=bit[j];
				bit[j]=bit[i];
				bit[i]=tmp;
				flag=true;
			}
			if (!flag) continue;
			++rk;
			for (int j=i+1;j<n;++j) if (bit[j].get(i)==1)
				bit[j].xor(bit[i]);
		}
		System.out.println((p[n+m-1]-p[n+m-1-rk]+mod)%mod);
	}
}