import java.util.*;

public class Main {

	int p,q,r,pos;
	String str;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			str = in.next();
			if(str.equals(".")) return ;
			System.out.println(solve());
		}
	}

	int formula(){
		char c = str.charAt(pos);
		pos++;
		if(c=='0') return 0;
		if(c=='1') return 1;
		if(c=='2') return 2;
		if(c=='P') return p;
		if(c=='Q') return q;
		if(c=='R') return r;
		if(c=='-'){
			int a = formula();
			return 2-a;
		}
		if(c=='('){
			int a = formula();
			boolean multi = str.charAt(pos)=='*';
			pos++;
			int b = formula();
			pos++;
			if(multi){
				if(a==0||b==0) return 0;
				if(a==2&&b==2) return 2;
				return 1;
			}
			else{
				if(a==2||b==2) return 2;
				if(a==0&&b==0) return 0;
				return 1;
			}
		}
		return -1;
	}

	int solve(){
		int ans = 0;
		for(p=0;p<3;p++){
			for(q=0;q<3;q++){
				for(r=0;r<3;r++){
					pos=0;
					if(formula() == 2) ans++;
				}
			}
		}
		return ans;
	}

	public static void main(String args[]){
		new Main().run();
	}
}