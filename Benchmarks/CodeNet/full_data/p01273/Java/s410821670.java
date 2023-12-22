
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	class Packet{
		int t;
		int from;
		int to;
		Packet(int t,int from,int to){
			this.t=t;
			this.from=from;
			this.to=to;
		}
	}

	public void run() {
		while(true){
			int N=sc.nextInt(),M=sc.nextInt();
			if(N==0)return;
			Packet[] ps=new Packet[M];

			for(int i=0;i<M;i++){
				ps[i]=new Packet(sc.nextInt(),sc.nextInt()-1,sc.nextInt()-1);
			}
			Arrays.sort(ps,new Comparator<Packet>(){
				@Override
				public int compare(Packet o1, Packet o2) {
					return o1.t-o2.t;
				}
			});
			boolean[] infected =new boolean[N];
			infected[0]=true;

			for(int i=0;i<M;i++){
				if(infected[ps[i].from])infected[ps[i].to]=true;
			}

			int res=0;
			for(int i=0;i<N;i++){
				if(infected[i])
					res++;
			}

			ln(res);
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