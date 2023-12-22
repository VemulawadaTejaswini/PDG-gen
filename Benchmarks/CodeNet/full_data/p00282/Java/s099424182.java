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

		String[] k = {"Mts","Fks","Nyt","Asg","Ggs","Gok","Sai","Sei","Kan","Ko","Jou","Jo","Gai","Kei","Cho","OKU","Man"};
		BigInteger zero = new BigInteger("0");

		while(in.hasNext()){
			String s = in.next();
			int n = in.nextInt();

			if(s.equals("0") && n == 0) return;

			BigInteger m = new BigInteger(s);

			m = m.pow(n);
			s = new String(m.toString());

			
		}
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }