
import java.util.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	class D{
		int d;
		int x;
		D(int d,int x){
			this.d=d;
			this.x=x;
		}
	}

	public void run() {
		while(true){
			int n=sc.nextInt(),m=sc.nextInt();
			if(n==0 && m==0)return;
			D[] dlist=new D[n];
			for(int i=0;i<n;i++){
				dlist[i]=new D(sc.nextInt(),sc.nextInt());
			}

			Arrays.sort(dlist,new Comparator<D>(){
				@Override
				public int compare(D o1, D o2) {
					return o2.x-o1.x;
				}
			});
			for(int i=0;i<n;i++){
				if(m>=dlist[i].d){
					m-=dlist[i].d;
					dlist[i].d=0;
				}else{
					dlist[i].d-=m;
					m=0;
				}
			}

			int sum=0;
			for(int i=0;i<n;i++){
				sum+=dlist[i].d*dlist[i].x;
			}
			ln(sum);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

	public int[] nextIntArray(int n){
		int[] res=new int[n];
		for(int i=0;i<n;i++){
			res[i]=sc.nextInt();
		}
		return res;
	}
	public static void pr(Object o) {
		out.print(o);
	}
	public static void ln(Object o) {
		out.println(o);
	}
	public static void ln() {
		out.println();
	}
}