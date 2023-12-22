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
		int[] a = new int[3];
		int[] b = new int[2];
		for(int i = 0; i <3; i++) a[i] = in.nextInt();
		for(int j = 0; j <2; j++) b[j] = in.nextInt();
		Arrays.sort(a);
		Arrays.sort(b);

		System.out.println(a[0] + b[0] - 50);
	}

	
}