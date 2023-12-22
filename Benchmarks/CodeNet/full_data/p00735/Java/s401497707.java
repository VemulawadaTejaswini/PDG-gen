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

	int n, max;
	boolean[] b;

	void run(){
		max=300001;
		b=new boolean[max];
		for(int i=2; i<max; i++){
			if(i%7!=1&&i%7!=6){
				continue;
			}
			LinkedList<Integer> list=divisor(i);
			b[i]=true;
			for(int d : list){
				b[i]&=(d%7!=1&&d%7!=6)||d==1||d==i;
			}
		}
		for(;;){
			n=sc.nextInt();
			if(n==1){
				break;
			}
			solve();
		}
	}

	void solve(){
		Integer[] is=divisor(n).toArray(new Integer[0]);
		sort(is);
		String ans=n+":";
		for(int d : is){
			if(b[d]){
				ans+=" "+d;
			}
		}
		println(ans);
	}

	LinkedList<Integer> divisor(int n){
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=1; i*i<=n; i++){
			if(n%i==0){
				list.add(i);
				if(i!=n/i){
					list.add(n/i);
				}
			}
		}
		return list;
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