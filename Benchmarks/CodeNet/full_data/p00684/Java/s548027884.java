import java.util.*;
import static java.lang.Math.*;

public class Main {

	class Complex{
		int real, imag;
		Complex(int r, int i){
			this.real = r;
			this.imag = i;
		}
		Complex add(Complex x){
			return new Complex(this.real + x.real, this.imag + x.imag);
		}
		Complex sub(Complex x){
			return new Complex(this.real - x.real, this.imag - x.imag);
		}
		Complex multi(Complex x){
			return new Complex(this.real*x.real-this.imag*x.imag, this.real*x.imag+this.imag*x.real);
		}
		boolean isOverflow(){
			return abs(this.real)>10000 || abs(this.imag)>10000;
		}
	}
	

	String str;
	int p;

	void run(){
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			str = in.nextLine();
			p = 0;
			Complex ans = expr();
			if(ans == null)System.out.println("overflow");
			else{
				if(ans.imag == 0){
					System.out.println(ans.real);
				}
				else if(ans.real == 0){
					System.out.println(ans.imag + "i");
				}
				else System.out.println(""+ans.real + (Integer.signum(ans.imag)>0?"+":"-") + abs(ans.imag)+"i");
			}
		}
	}

	Complex expr(){
		Complex t = term();
		if(t == null || t.isOverflow()) return null;
		while(p<str.length() && (str.charAt(p)=='+' || str.charAt(p)=='-')){
			boolean isAdd = str.charAt(p++) == '+';
			Complex tt = term();
			if(tt == null || tt.isOverflow()) return null;
			if(isAdd){
				t = t.add(tt);
			}
			else{
				t = t.sub(tt);
			}
			if(t == null || t.isOverflow()) return null;
		}
		return t;
	}
	
	Complex term(){
		Complex f = fact();
		if(f == null || f.isOverflow()) return null;
		while(p<str.length() && str.charAt(p)=='*'){
			p++;
			Complex ff = fact();
			if(ff == null || ff.isOverflow()) return null;
			f = f.multi(ff);
			if(f == null || f.isOverflow()) return null;
		}
		return f;
	}

	Complex fact(){
		if(str.charAt(p)=='('){
			p++;
			Complex e = expr();
			if(e == null || e.isOverflow()) return null;
			p++;
			return e;
		}
		Complex n = num();
		if(n == null || n.isOverflow()) return null;
		return n;
	}

	Complex num(){
		if(str.charAt(p)=='i'){
			p++;
			return new Complex(0,1);
		}
		int ret = str.charAt(p++) - '0';
		while(p<str.length() && Character.isDigit(str.charAt(p))){
			ret = ret*10 + str.charAt(p++) - '0';
			if(ret > 10000){
				return null;
			}
		}
		return new Complex(ret, 0);
	}

	public static void main(String args[]){
		new Main().run();
	}
}