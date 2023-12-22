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

	int[] a;
	int n;
	boolean f;

	void run(){
		n=4;
		a=new int[n];
		for(;;){
			int sq=0;
			for(int i=0; i<n; i++){
				a[i]=sc.nextInt();
				sq+=a[i]*a[i];
			}
			if(sq==0){
				break;
			}
			solve();
		}
	}

	void solve(){
		f=false;
		rec(0);
		if(!f){
			println("0");
		}
	}

	void rec(int i){
		if(f){
			return;
		}
		if(i==n){
			// debug(a);
			check();
			return;
		}
		for(int j=i; j<n; j++){
			// swap[i,j];
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			rec(i+1);
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	}

	void check(){
		// (a(b(cd)))
		// (((ab)c)d)
		// ((ab)(cd))
		String[] ops={"+", "-", "*"};
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				for(int k=0; k<3; k++){
					String format="";
					if(cal(a[0], i, cal(a[1], j, cal(a[2], k, a[3])))==10){
						format="(%d %s (%d %s (%d %s %d)))";
						f=true;
					}else if(cal(cal(cal(a[0], i, a[1]), j, a[2]), k, a[3])==10){
						format="(((%d %s %d) %s %d) %s %d)";
						f=true;
					}else if(cal(cal(a[0], i, a[1]), j, cal(a[2], k, a[3]))==10){
						format="((%d %s %d) %s (%d %s %d))";
						f=true;
					}
					if(f){
						println(String.format(format, a[0], ops[i], a[1],
								ops[j], a[2], ops[k], a[3]));
						return;
					}
				}
			}
		}
	}

	int cal(int a, int op, int b){
		switch(op){
		case 0:
			return a+b;
		case 1:
			return a-b;
		case 2:
			return a*b;
		}
		return 0;
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
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