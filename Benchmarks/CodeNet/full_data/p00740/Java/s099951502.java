
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public void run() {
		while(true){
			int n=sc.nextInt(),p=sc.nextInt();
			if(n==0 && p==0)
				return;
			int ind=0;
			int freestone=p;
			int[] val=new int[n];
			while(val[ind]!=p){
				if(freestone==0){
					freestone=val[ind];
					val[ind]=0;
				}else{
					freestone--;
					val[ind]++;
				}
				ind=(ind+1)%n;
			}
			ln(ind);
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