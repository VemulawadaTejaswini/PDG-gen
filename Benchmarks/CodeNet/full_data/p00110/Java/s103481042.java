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

	String e1, e2, e3;
	int x;

	void run(){
		for(; sc.hasNext();){
			String[] ss=sc.nextLine().split("[+]");
			e1=ss[0];
			ss=ss[1].split("=");
			e2=ss[0];
			e3=ss[1];
			solve();
		}
	}

	void solve(){
		for(x=0; x<10; x++){
			if(toBI(e1).add(toBI(e2)).compareTo(toBI(e3))==0){
				println(""+x);
				return;
			}
		}
		println("NA");
	}

	int toInt(String s){
		int n=0;
		for(char c : s.toCharArray()){
			if(c=='X'){
				n=n*10+x;
			}else{
				n=n*10+(c-'0');
			}
		}
		return n;
	}

	BigInteger toBI(String s){
		BigInteger bi=BigInteger.ZERO;
		for(char c : s.toCharArray()){
			if(c=='X'){
				bi=bi.multiply(BigInteger.TEN).add(new BigInteger(""+x));
			}else{
				bi=bi.multiply(BigInteger.TEN).add(new BigInteger(""+c));
			}
		}
		return bi;
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