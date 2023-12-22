import java.util.*;

public class Main {
	String s = "";
	int pos = 0;
	
	int exp(){
		int p = term();
		while(true){
			if(pos==s.length()) break;
			int q = s.codePointAt(pos);
			pos++;
			if(q==43) p+=term();
			else if(q==45) p-=term();
			else break;
		}
		return p;
	}
	
	int term(){
		int p = fact();
		while(true){
			if(pos==s.length()) break;
			int q = s.codePointAt(pos);
			pos++;
			if(q==42) p*=fact();
			else if(q==47) p/=fact();
			else break;
		}
		pos--;
		return p;
	}
	
	int fact(){
		int q = s.codePointAt(pos);
		pos++;
		if(q==40) return exp();
		if(q==43) return fact();
		if(q==45) return -fact();

		pos--;
		int ini = pos;
		while(s.codePointAt(pos)>=48 && s.codePointAt(pos)<=57){
			pos++;
			if(pos==s.length()) break;
		}
		int p = Integer.valueOf(s.substring(ini,pos));
		return p;
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			s = sc.next();
			pos = 0;
			System.out.println(exp());
		}
	}

	
	public static void main(String[] args) {
		new Main().solve();
	}	
}