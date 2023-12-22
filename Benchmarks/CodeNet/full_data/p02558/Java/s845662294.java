import java.util.*;

class UF{
	public int[] a;
	public UF(int size){
		Arrays.fill(a=new int[size],-1);
	}
	public int root(int t){
		return a[t]<0?t:(a[t]=root(a[t]));
	}
	public boolean connect(int r,int s){
		r=root(r);
		s=root(s);
		if(r==s)
			return false;
		if(a[r]>a[s]){
			a[s]+=a[r];
			a[r]=s;
		}else{
			a[r]+=a[s];
			a[s]=r;
		}
		return true;
	}
	public boolean isConnected(int a,int b){
		return root(a)==root(b);
	}
	public int groupSize(int t){
		return -a[root(t)];
	}
}

public class Main{
	public static void main(String[] $){
		var s=new Scanner(System.in);

		var n=Integer.parseInt(s.next());
		var q=Integer.parseInt(s.next());

		var uf=new UF(n);

		for(int i=0;i<q;++i){
			var t=Integer.parseInt(s.next());
			var u=Integer.parseInt(s.next());
			var v=Integer.parseInt(s.next());

			if(t==0)
				uf.connect(u,v);
			else
				System.out.println(uf.isConnected(u,v)?1:0);
		}
	}
}
