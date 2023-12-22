
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
	
	Scanner in = new Scanner(System.in);

	void solve(){
		while(in.hasNext()){
			int n = in.nextInt();
			if(n == 0) return;
			for(int i = 0; i < n; i++){
				int pm = in.nextInt(), pe = in.nextInt(), pj = in.nextInt();
				if(pm == 100 || pe == 100 || pj == 100) System.out.println("A");
				else if((pm + pe) / 2 >= 90) System.out.println("A");
				else if((pm + pe + pj) / 3 >= 80) System.out.println("A");
				else if((pm + pe + pj) / 3 >= 70) System.out.println("B");
				else if((pm + pe + pj) / 3 >= 50 && Math.max(pm, pe) >= 80) System.out.println("B");
				else System.out.println("C");
			}
		}
	}

	

}