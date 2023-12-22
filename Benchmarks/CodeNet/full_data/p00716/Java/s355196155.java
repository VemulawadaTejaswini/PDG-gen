
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public void run() {
		int money=sc.nextInt(),y=sc.nextInt();
		int n=sc.nextInt();

		int max=0;
		for(int c=0;c<n;c++){
			int m=money;
			int type=sc.nextInt();
			double par=sc.nextDouble();
			int dec=sc.nextInt();
			switch(type){
				case 1:
					for(int i=0;i<y;i++){
						m=m+(int)(m*par)-dec;
					}
					if(max<m)max=m;
					break;
				case 0:
					int risi=0;
					for(int i=0;i<y;i++){
						risi+=m*par;
						m-=dec;
					}
					m+=risi;
					if(max<m)max=m;
					break;
			}
		}
		ln(max);
	}
	public static void main(String[] args) {
		int t=sc.nextInt();
		while(t--!=0)
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