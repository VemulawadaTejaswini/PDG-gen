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
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = in.nextInt();
		Arrays.sort(a);
		for(int i = 1; i <= a[0]; i++){
			for(int j = 0; j < n; j++){
				if(a[j] % i != 0) break;
				if(j == n-1) System.out.println(i);
			}
		}
	}

	
}