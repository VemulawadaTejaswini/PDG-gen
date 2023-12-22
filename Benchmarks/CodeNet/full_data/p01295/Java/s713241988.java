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
		while(in.hasNext()){
			int n = in.nextInt(), m = in.nextInt();
			if(n == 0 && m == 0) return;
			StringBuilder sb = new StringBuilder();
			for(int i = n; sb.length()<m; i++){
				sb.append(String.valueOf(i));
			}

			String s = sb.toString();
			s = s.substring(0, m);

			System.out.println(s);
		}
	}


	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }