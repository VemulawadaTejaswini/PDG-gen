import java.util.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public void run() {

		while(true){
			int pay=sc.nextInt();
			if(pay==0)return;
			int m10=sc.nextInt(),m50=sc.nextInt(),m100=sc.nextInt(),m500=sc.nextInt();

			int min=Integer.MAX_VALUE;
			int p500=0,p100=0,p50=0,p10=0;

			for(int u10=0;u10<=m10;u10++)for(int u50=0;u50<=m50;u50++)
				for(int u100=0;u100<=m100;u100++)for(int u500=0;u500<=m500;u500++){
					int res=u10*10+u50*50+u100*100+u500*500;
					if(pay<=res){
						res-=pay;
						int t500=res/500;
						res%=500;
						int t100=res/100;
						res%=100;
						int t50=res/50;
						res%=50;
						int t10=res/10;

						int mc=t500+t100+t50+t10+(m10-u10)+(m50-u50)+(m100-u100)+(m500-u500);
						if(min>mc){
							p500=u500;
							p100=u100;
							p50=u50;
							p10=u10;
							min=mc;
						}
					}
			}
			if(p10>0)ln("10 "+p10);
			if(p50>0)ln("50 "+p50);
			if(p100>0)ln("100 "+p100);
			if(p500>0)ln("500 "+p500);

			ln();
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