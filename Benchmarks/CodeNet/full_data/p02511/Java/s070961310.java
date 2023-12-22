import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	void run(){
		for(;;){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int l=0, d=0, m=0, nl=0, nd=0, nm=0;
			for(int i=0; i<n; i++){
				String[] s=sc.next().split(":");
				int hh=Integer.parseInt(s[0]);
				int mm=Integer.parseInt(s[1]);
				int MM=sc.nextInt();
				int ok=(MM-mm+60)%60<=8?1:0;
				if(11<=hh&hh<=14){
					nl++;
					l+=ok;
				}else if(18<=hh&&hh<=20){
					nd++;
					d+=ok;
				}else if(hh>=21||hh<=1){
					nm++;
					m+=ok;
				}
			}
			debug(l, nl);
			debug(d, nd);
			debug(m, nm);
			println("lunch "+(nl==0?"no guest":100*l/nl));
			println("dinner "+(nd==0?"no guest":100*d/nd));
			println("midnight "+(nm==0?"no guest":100*m/nm));
		}
	}

	void debug(Object... os){
		// System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}