import java.util.*;

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
		for(int i = 0; i < 7; i++){
			int n = in.nextInt(), m = in.nextInt();
			System.out.println(n - m);
		}
	}

}