import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	String s;

	void run(){
		s=sc.nextLine();
		solve();
	}

	char[] cs;
	int max;

	void solve(){
		s+="$";
		cs=s.toCharArray();
		max=-1;
		dfs(0);
		println(max+"");
	}

	void dfs(int i){
		char[] op={'0', '1', '+', '-', '*', '(', ')'};
		if(i==cs.length){
			// 発動
			max=max(max, calc());
			return;
		}
		if(cs[i]=='.'){
			for(char c : op){
				cs[i]=c;
				dfs(i+1);
				cs[i]='.';
			}
		}else{
			dfs(i+1);
		}
	}

	int calc(){
		Result r=E(0);
		// debug(cs);
		r.good&=r.p==cs.length-1;
		// debug(r.good, r.p, r.value);
		// ()の間には記号がいる
		// if(false)
		if(r.good){
			// ((1*1)) X
			int n=cs.length;
			for(int i=0; i<n; i++){
				if(cs[i]!='('){
					continue;
				}
				int left=i, right=left+1;
				int stack=0;
				for(; cs[right]!=')'||stack!=0; right++){
					if(cs[right]=='('){
						stack++;
					}else if(cs[right]==')'){
						stack--;
					}
				}
				boolean op=false;
				// debug(left, right);
				for(left++; cs[left]!='('&&cs[left]!=')'; left++){
					op|=cs[left]=='+'||cs[left]=='-'||cs[left]=='*';
				}
				for(right--; cs[right]!='('&&cs[right]!=')'; right--){
					op|=cs[right]=='+'||cs[right]=='-'||cs[right]=='*';
				}
				// debug("op", op);
				r.good&=op;
			}
			// debug(r.bad);
		}
		if(r.good&&new String(cs).indexOf('(')>=0){
			debug(new String(cs), r.value);
		}
		return r.good?r.value:-1;
	}

	// 0~1023

	boolean debug=false;

	Result E(int p){
		if(debug)
			debug("E", p);
		Result r=F(p);
		if(!r.good){
			return r;
		}
		for(; cs[r.p]=='+'||cs[r.p]=='-';){
			Result r2=F(r.p+1);
			if(!r2.good){
				return r2;
			}
			if(cs[r.p]=='+'){
				r.value+=r2.value;
			}else{
				r.value-=r2.value;
			}
			r.update();
			if(!r.good){
				return r;
			}
			r.p=r2.p;
		}
		return r;
	}

	Result F(int p){
		if(debug)
			debug("F", p);
		Result r=T(p);
		if(!r.good){
			return r;
		}
		for(; cs[r.p]=='*';){
			Result r2=T(r.p+1);
			if(!r2.good){
				return r2;
			}
			r.value*=r2.value;
			r.update();
			if(!r.good){
				return r;
			}
			r.p=r2.p;
		}
		return r;
	}

	Result T(int p){
		if(debug)
			debug("T", p);
		if(cs[p]=='('){
			Result r=E(p+1);
			if(!r.good||cs[r.p]!=')'){
				r.good=false;
				return r;
			}
			r.p++;
			return r;
		}else if(cs[p]=='0'||cs[p]=='1'){
			Result r=new Result(p, 0);
			for(; Character.isDigit(cs[p]); p++){
				r.value=r.value*2+cs[p]-'0';
				r.update();
			}
			return r;
		}else{
			return new Result(0, -1);
		}
	}

	class Result{
		int p, value;
		boolean good;

		Result(int p, int value){
			this.p=p;
			this.value=value;
			good=true;
			update();
		}

		void update(){
			if(value<0||value>=1024){
				good=false;
			}
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
		new Main().run();
	}
}