
import java.util.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();


	public void run() {
		TCase:while(true){
			int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),x=sc.nextInt();
			if(n==0)return;
			int[] y=nextIntArray(n);

			int t=0,ind=0;
			do{
				if(y[ind]==x)ind++;
				if(ind==n){
					ln(t);
					continue TCase;
				}
				x=(a*x+b)%c;
				t++;
			}while(t<=10000);
			ln(-1);
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