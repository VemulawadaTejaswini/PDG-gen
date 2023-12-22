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
		int n = in.nextInt(), m = in.nextInt();
		String s[] = new String[n];
		for(int i = 0; i < n; i++) s[i] = in.next();
		for(int i = 0; i < n; i++){
			int c = -1;
			for(int j = 0; j < m; j++){
				if(j != 0) System.out.print(" ");
				if(s[i].charAt(j) == 'c') c = j;
				if(c == -1) System.out.print(c);
				else System.out.print(j - c); 
			}
			System.out.println();
		}
	}

}