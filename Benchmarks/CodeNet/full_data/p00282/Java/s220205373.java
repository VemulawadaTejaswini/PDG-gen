import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	void solve(){

		String[] k = {"Mts","Fks","Nyt","Asg","Ggs","Gok","Sai","Sei","Kan","Ko","Jou","Jo","Gai","Kei","Cho","Oku","Man", ""};
		BigInteger zero = new BigInteger("0");

		while(in.hasNext()){
			String s = in.next();
			int n = in.nextInt();

			if(s.equals("0") && n == 0) return;

			BigInteger m = new BigInteger(s);

			m = m.pow(n);
			s = new String(m.toString());

			int d = (s.length() - 1) / 4, a = s.length() % 4;

			//System.out.println(d + " " + a);

			StringBuilder temp = new StringBuilder();
			StringBuilder ans = new StringBuilder();

			for(int i = 0; i < s.length(); i++){
				temp.append(s.charAt(i));
				if((i != 0 && (i - a) % 4 == 3) || (i < a && i == a - 1)){
					while(temp.length() > 0 && temp.charAt(0) == '0'){
						temp.deleteCharAt(0);
					}
					if(temp.length() > 0) {
						ans.append(temp.toString() + k[k.length - 1 - d + i / 4]);
					}
					temp = new StringBuilder();
				}
			}

			System.out.println(ans.toString());
		}
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }