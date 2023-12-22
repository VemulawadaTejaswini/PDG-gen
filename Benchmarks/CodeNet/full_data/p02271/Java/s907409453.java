import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int n,q;
	int[] A,m;
	
	public void input() {
		n = sc.nextInt();
		A = new int[n];
		for(int i=0; i<n; i++) A[i] = sc.nextInt();
		
		q = sc.nextInt();
		m = new int[q];
		for(int i=0; i<q; i++) m[i] = sc.nextInt();
	}
	
	//mは作りたい数。ここでは配列mに格納されている値のこと。
	public int solve(int i, int m) {
		if(m == 0) return 1;//true
		if(i >= n) return 0;//false
		if(solve(i+1,m)==1 || solve(i+1,m-A[i])==1) return 1;
		else return 0;
	}
	
	public void answer() {
		for(int i=0; i<q; i++) {
			int k=0;
			if(solve(k,m[i]) == 1) System.out.println("yes");
			else System.out.println("no");
		}
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.answer();
	}
}

