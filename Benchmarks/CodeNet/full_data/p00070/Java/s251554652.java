import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	static final int INF=1<<28;
	static final double EPS=1e-9;

	int n, s;

	void run(){
		for(; sc.hasNext();){
			n=sc.nextInt();
			s=sc.nextInt();
			solve();
		}
		sc.close();
	}

	void solve(){
		if(n>10||s>330){
			println("0");
			return;
		}
		println(rec(0, 0, 0)+"");
	}

	int rec(int sum, int flag, int k){
		if(sum>s){
			return 0;
		}
		if(k==n){
			if(sum==s){
				return 1;
			}else{
				return 0;
			}
		}
		int ret=0;
		for(int i=0; i<10; i++){
			if(((1<<i)&flag)==0){
				ret+=rec(sum+(k+1)*i, (1<<i)|flag, k+1);
			}
		}
		return ret;
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
		new Main().run();
	}
}