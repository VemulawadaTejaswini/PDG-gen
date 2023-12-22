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

	String s;

	void run(){
		for(int n=sc.nextInt(); n>0; n--){
			s=sc.next();
			println(equation(0).val+"");
		}
	}

	R equation(int p){
		R r=factor(p);
		for(;;){
			char c=s.charAt(r.p);
			if(c=='+'||c=='-'){
				R q=factor(r.p+1);
				if(c=='+')
					r.val+=q.val;
				else
					r.val-=q.val;
				r.p=q.p;
			}else{
				break;
			}
		}
		return r;
	}

	R factor(int p){
		R r=term(p);
		for(;;){
			char c=s.charAt(r.p);
			if(c=='*'||c=='/'){
				R q=factor(r.p+1);
				if(c=='*')
					r.val*=q.val;
				else
					r.val/=q.val;
				r.p=q.p;
			}else{
				break;
			}
		}
		return r;
	}

	R term(int p){
		if(s.charAt(p)=='('){
			R r=equation(p+1);
			r.p++; // skip ')'
			return r;
		}else{
			long val=0;
			for(; Character.isDigit(s.charAt(p)); p++){
				val=val*10+(s.charAt(p)-'0');
			}
			return new R(p, val);
		}
	}

	class R{
		int p;
		long val;

		R(int p, long val){
			this.p=p;
			this.val=val;
		}
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