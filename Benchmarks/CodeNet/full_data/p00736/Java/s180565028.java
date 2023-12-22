import java.util.*;

public class Main {
	
	char[] c;
	int id;
	
	char not(char x){
		if(x=='0') return '2';
		else if(x=='2') return '0';
		else return '1';
	}
	
	char plus(char x, char y){
		if(x=='0' && y=='0') return '0';
		else if(x=='2' || y=='2') return '2';
		else return '1';
	}
	
	char mul(char x, char y){
		if(x=='0' || y=='0') return '0';
		else if(x=='2' && y=='2') return '2';
		else return '1';
	}
	
	char exp(){
		char a = fact();
		id++;
		if(id<c.length){
			if(c[id]=='+'){
				id++;
				a = plus(a, exp());
			}else if(c[id]=='*'){
				id++;
				a = mul(a, exp());
			}
		}
		return a;
	}
	
	char fact(){
		char b = c[id];
		if(b=='('){
			id++;
			b = exp();
		}else if(b=='-'){
			id++;
			b = not(fact());
		}
		return b;
	}
	
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String s = sc.next();
			if(s.compareTo(".")==0) break;
			
			int cnt = 0;
			String t;
			for(int p=48;p<51;p++){
				for(int q=48;q<51;q++){
					for(int r=48;r<51;r++){
						t = s;
						t = t.replaceAll("--", "");
						t = t.replace('P', (char)p).replace('Q', (char)q).replace('R', (char)r);
						c = t.toCharArray();
						
						id = 0;
						if(exp()=='2') cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();	
	}	
}