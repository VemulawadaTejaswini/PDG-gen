import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();


	public void run() {
		while(true){
			int W=sc.nextInt(),H=sc.nextInt();
			if(W==0 && H==0)return;

			int[] w=nextIntArray(W);
			int[] h=nextIntArray(H);

			int[] imosw=new int[W+1];
			for(int i=0;i<W;i++){
				imosw[i+1]=imosw[i]+w[i];
			}
			int[] imosh=new int[H+1];
			for(int i=0;i<H;i++){
				imosh[i+1]=imosh[i]+h[i];
			}
			int res=0;
			for(int wf=0;wf<=W;wf++){
				for(int wt=wf+1;wt<=W;wt++){
					int wn=imosw[wt]-imosw[wf];
					int hf=0,ht=0;
					while(ht<=H){
						if(ht==hf){
							ht++;
							continue;
						}
						int hn=imosh[ht]-imosh[hf];
						if(hn==wn){
							res++;
						}
						if(hn<wn)ht++;
						else hf++;
					}
				}
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