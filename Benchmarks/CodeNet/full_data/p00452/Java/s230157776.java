import java.util.Scanner;
import java.util.TreeSet;
class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt() {
		return Integer.parseInt(s.next());
	}
	static TreeSet<Integer>t=new TreeSet<>();
	public static void main(String[]$){
		while(true) {
			t.clear();
			int n=gInt(),m=gInt();
			if(n==0)return;
			{
				int[]v=new int[n+1];
				for(int i=0;i<n;++i) {
					v[i]=gInt();
				}
				for(int i=0;i<n+1;++i) {
					for(int j=0;j<n+1;++j) {
						int o=v[i]+v[j];
						if(o<=m)
							t.add(o);
					}
				}
			}
			int r=0;
			for(int v:t) {
				r=Math.max(r,v+t.floor(m-v));
			}
			System.out.println(r);
 		}
	}
}