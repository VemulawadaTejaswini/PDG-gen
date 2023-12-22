import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		for(int i=0; i<q; i++){
			if(solve(A, 0, sc.nextInt())) System.out.println("yes");
			else                          System.out.println("no");
		}
	}
	static boolean solve(int A[], int offset, int m){
		if(m==0) return true;
		for(int i=offset; i<A.length; i++){
			if(m>=A[i]){
				if(solve(A, i+1, m-A[i])) return true;
			}
		}
		return false;
	}
}