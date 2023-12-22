import java.util.*;

public class Main {
	int p;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.nextLine();
			if(str.equals("0:")) break;
			str = str.replaceAll(" ", "");
			String [] str2 = str.split(":");
			p = Integer.parseInt(str2[0]);
			
			Parse pa = new Parse(str2[1]+"#");
			int ans = pa.exp();
			if(pa.flg){
				System.out.println("NG");
			}
			else{
				System.out.println(str2[1] + " = " + ans + " (mod " + p + ")");
			}
		}
	}

	class Parse{
		String str;
		int pos;
		boolean flg;
		public Parse(String str){
			this.str = str;	pos = 0;
			flg = false;
		}
		
		private int exp() {
			if(flg) return 1;
			int res = term();
			while(true){
				char op = str.charAt(pos);
				if((op == '+') || (op == '-')){
					int old = res;
					pos++;
					res = term();
					switch(op){
					case '+': 
						res = (old + res) % p;
						break;
					case '-':
						int temp = p - res;
						res = (temp + old) % p;
						break;
					}
				}
				else break;
			}
			return res;
		}

		private int term() {
			if(flg){
				return 1;
			}
			int res = fact();
			while(true){
				char op = str.charAt(pos);
				if((op == '*') || (op == '/')){
					int old = res;
					pos++;
					res = fact();
					switch(op){
					case '*':
						res = (old * res) % p;
						break;
					case '/':
						if(res == 0){
							flg = true;
							return 1;
						}
						int temp = find(res);
						res = (old * temp) % p;
						break;
					}
				}
				else break;
			}
			return res;
		}

		private int find(int res) {
			for(int i = 0;; i++){
				if((p * i + 1) % res == 0){
					return (p * i + 1) / res;
				}
			}
		}

		private int fact() {
			if(flg) return 1;
			if(Character.isDigit(str.charAt(pos))){
				int t = str.charAt(pos) - '0';
				pos++;
				while(Character.isDigit(str.charAt(pos))){
					t = t * 10 + (str.charAt(pos) - '0');
					pos++;
				}
				return t;
			}
			else if(str.charAt(pos) == '('){
				pos++;
				int res = exp();
				pos++;
				return res;
			}
			return 0;
		}
	}


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}