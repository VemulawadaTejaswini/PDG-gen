
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	class Era{
		int len;
		int y;
		String name;
		Era(int len,int y,String name){
			this.len=len;
			this.y=y;
			this.name=name;
		}
	}

	public void run() {
		TCase:while(true){
			int n=sc.nextInt(),q=sc.nextInt();
			if(n==0)return;
			Era[] eras=new Era[n];
			for(int i=0;i<n;i++){
				String name=sc.next();
				int d=sc.nextInt();
				int y=sc.nextInt();
				eras[i]=new Era(d,y,name);
			}
			Arrays.sort(eras,new Comparator<Era>(){
				@Override
				public int compare(Era o1, Era o2) {
					return o1.y-o2.y;
				}
			});
			int[] ys=new int[n];

			for(int i=0;i<n;i++){
				ys[i]=eras[i].y;
			}
			for(int i=0;i<q;i++){
				int y=sc.nextInt();
				int ind=Arrays.binarySearch(ys,y);
				if(ind<0)ind=~ind;
				if(0<=ind && ind<ys.length){
					Era era=eras[ind];
					if(0<era.len+y-era.y)
						ln(era.name+" "+(era.len+y-era.y));
					else
						ln("Unknown");
				}else
					ln("Unknown");
			}
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