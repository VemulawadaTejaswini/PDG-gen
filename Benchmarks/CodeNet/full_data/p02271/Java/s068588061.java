import java.util.*;

class Main {

	static int n = 0;
	static int[] A = null;

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		n = stdIn.nextInt();

		A = new int[n];
		for (int i=0; i<n; i++) {
			A[i] = stdIn.nextInt();
		}

		int q = stdIn.nextInt();

		for (int i=0; i<q; i++) {
			if(solve(0,stdIn.nextInt()))
				System.out.println("yes");
			else
				System.out.println("no");
		}
 	}

 	static boolean solve(int i,int m){
 		if(i >= n)
 			return m==0;
 		if(solve(i+1,m))
 			return true;
 		if(solve(i+1,m-A[i]))
 			return true;
 		return false;
 	}
}