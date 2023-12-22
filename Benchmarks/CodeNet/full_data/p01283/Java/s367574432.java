
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	int m=256;

	double EPS=1E-6;
	public void run() {
		while(true){
			int N=sc.nextInt();
			if(N==0)return;

			int[] l=nextIntArray(N);

			double resh=Double.MAX_VALUE;
			int ress=-1,resa=-1,resc=-1;
			for(int s=0;s<=15;s++)
				for(int a=0;a<=15;a++)
					for(int c=0;c<=15;c++){
						int[] r=new int[N+1];
						int[] o=new int[m];
						r[0]=s;
						for(int i=1;i<=N;i++){
							r[i]=(a*r[i-1]+c)%m;
							o[(r[i]+l[i-1])%m]++;
						}

						double h=0;
						for(int i=0;i<m;i++){
							if(o[i]!=0)h-=((double)o[i]/N)*Math.log((double)o[i]/N);
						}
						if(h+EPS<resh){
							resh=h;
							ress=s;
							resa=a;
							resc=c;
						}
					}
			ln(ress+" "+resa+" "+resc);
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