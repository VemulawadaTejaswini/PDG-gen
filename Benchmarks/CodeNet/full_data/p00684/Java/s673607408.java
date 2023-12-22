import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			p = (sc.next()+"=").toCharArray();

			flg = true;
			Complex ans = expr(0).val;
			if(flg && ans.correct()){
				System.out.println(ans);
			}
			else{
				System.out.println("overflow");
			}
		}
	}

	private static char[] p;
	private static boolean flg;

	private static Parsed expr(int idx){
		Parsed r = term(idx);
		while(p[r.idx] == '+' || p[r.idx] == '-'){
			char op = p[r.idx];
			Complex tmp = r.val;
			r = term(r.idx+1);
			if(op == '+'){
				r.val = tmp.add(r.val);
				if(!r.val.correct()) flg = false;
			}
			else{
				r.val = tmp.sub(r.val);
				if(!r.val.correct()) flg = false;
			}
		}
		return r;
	}

	private static Parsed term(int idx){
		Parsed r = fact(idx);
		while(p[r.idx] == '*'){
			char op = p[r.idx];
			Complex tmp = r.val;
			r = fact(r.idx+1);
			r.val = tmp.mul(r.val);
			if(!r.val.correct()) flg = false;
		}
		return r;
	}

	static Parsed fact(int idx){
		if(p[idx] == 'i'){
			return new Parsed(new Complex(0,1),idx+1);
		}
		else if(Character.isDigit(p[idx])){
			while(p[idx]=='0') idx++;

			long t = 0;
			int len = 0;

			while(Character.isDigit(p[idx])){
				t = t * 10 + p[idx++] - '0';
				len++;
			}
			if(t >= 10001 || len > 6) flg = false;
			return new Parsed(new Complex(t,0),idx);
		}
		else if(p[idx] == '('){
			Parsed r = expr(idx+1);
			if(!r.val.correct()) flg = false;
			if(p[r.idx]!=')') return null;
			return new Parsed(r.val,r.idx+1);
		}
		else return null;
	}
}

class Parsed{
	Complex val;
	int idx;

	Parsed(Complex val,int idx){
		this.val = new Complex(val.real,val.imag);
		this.idx = idx;
	}
}

class Complex{
	long real;
	long imag;

	Complex(long real,long imag){
		this.real = real;
		this.imag = imag;
	}

	Complex add(Complex c){
		return new Complex(real + c.real, imag + c.imag);
	}

	Complex sub(Complex c){
		return new Complex(real - c.real, imag - c.imag);
	}

	Complex mul(Complex c){
		return new Complex(real * c.real - imag * c.imag,
											 real * c.imag + imag * c.real);
	}

	boolean correct(){
		return Math.abs(real) <= 10000 && Math.abs(imag) <= 10000;
	}

	public String toString(){
		if(real == 0){
			if(imag == 0) return "0";
			return imag + "i";
		}
		else{
			if(imag == 0) return ""+real;
		}

		return String.format("%d%c%di",real,(imag>=0?'+':'-'),Math.abs(imag));
	}
}