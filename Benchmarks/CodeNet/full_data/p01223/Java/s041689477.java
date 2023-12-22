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
		int t = in.nextInt();
		for(int i = 0; i < t; i++){
			int n = in.nextInt();
			int[] a = new int[n];
			for(int j = 0; j < n; j++) a[j] = in.nextInt();
			int b = 0, c = 0;
			for(int j = 0; j < n -1; j++){
				if(a[j] < a[j + 1] && a[j + 1] - a[j] > b) b = a[j + 1] - a[j];
				else if(a[j] - a[j + 1] > c) c = a[j] - a[j + 1]; 
			}
			System.out.println(b + " " + c);
		}
	}

	
	
}