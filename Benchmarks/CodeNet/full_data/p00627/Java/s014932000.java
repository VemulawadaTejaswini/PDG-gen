
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;


class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	

	void solve(){
		Scanner in = new Scanner(System.in);

		while(in.hasNext()) {
			int n = in.nextInt() / 4;
			if (n == 0) return;
			int sum = 0;
			for(int i = 0; i < n; i++){
				int t = in.nextInt();
				sum += t;
			}
			System.out.println(sum);
		}
		
	}
}