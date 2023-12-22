import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n-- > 0){
			p = sc.next().toCharArray();
			Parsed ans = expr(0);
			System.out.println(ans.val);
		}
	}

	static char[] p;

	static Parsed expr(int idx){
		Parsed r = term(idx);
		while(p[r.idx] == '+' || p[r.idx] == '-'){
			char op = p[r.idx];
			int tmp = r.val;
			r = term(r.idx + 1);
			if(op == '+') r.val = tmp + r.val;
			else r.val = tmp - r.val;
		}
		return r;
	}

	static Parsed term(int idx){
		Parsed r = fact(idx);
		while(p[r.idx] == '*' || p[r.idx] == '/'){
			char op = p[r.idx];
			int tmp = r.val;
			r = fact(r.idx + 1);
			if(op == '*') r.val = tmp * r.val;
			else r.val = tmp / r.val;
		}
		return r;
	}

	static Parsed fact(int idx){
		if(Character.isDigit(p[idx])){
			int t = p[idx++] - '0';
			while(Character.isDigit(p[idx]))t = t*10 + p[idx++] - '0';
			return new Parsed(t,idx);
		}
		else if(p[idx] == '('){
			Parsed r = expr(idx + 1);
			if(p[r.idx] != ')') return null;
			return new Parsed(r.val, r.idx + 1);
		}
		else return null;
	}
}

class Parsed{
	int val;
	int idx;
	Parsed(int val,int idx){
		this.val = val;
		this.idx = idx;
	}
}