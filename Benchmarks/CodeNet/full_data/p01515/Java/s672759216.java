import java.util.*;

public class Main {
	char[][] c;
	boolean[] r = new boolean[11];
	boolean flag;
	int id;
	
	void loop(int n){
		if(flag==false) return;
		if(n==11){
			id = 0;
			boolean t0 = exp(0);
			id = 0;
			boolean t1 = exp(1);
			if(t0!=t1) flag = false;
		}else{
			r[n] = true;
			loop(n+1);
			r[n] = false;
			loop(n+1);
		}
	}
	
	boolean exp(int m){
		boolean q = fact(m);
		id++;
		if(id<c[m].length){
			char p = c[m][id];
			if(p=='+'){
				id++;
				q = q|exp(m);
			}else if(p=='*'){
				id++;
				q = q&exp(m);
			}else if(p=='/'){
				id++;
				boolean v = exp(m);
				if(q==true && v==false) q = false;
				else q = true;
			}
		}
		return q;
	}
	
	boolean fact(int m){
		char p = c[m][id];
		boolean q = false;
		if(p=='('){
			id++;
			q = exp(m);
		}else if(p=='-'){
			id++;
			q = !fact(m);
		}else{
			if(97<=(int)p && (int)p<=107) q = r[(int)p-97];
			else if(p=='T') q = true;
			else if(p=='F') q = false;
		}
		return q;
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String s = sc.next();
			if(s.compareTo("#")==0) break;
			String[] t = s.replace("->", "/").split("=");
			c = new char[2][];
			c[0] = t[0].toCharArray();
			c[1] = t[1].toCharArray();
			flag = true;
			loop(0);
			if(flag==true) System.out.println("YES");
			else System.out.println("NO");
		}	
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}