import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i=0; i<n; i++) ar[i] = sc.nextInt();
		int m = sc.nextInt();
		for (int i=0; i<m; i++) {
			System.out.println(BinarySearch(ar, sc.nextInt())==-1?0:1);
		}
	}

	static int BinarySearch (int[] ar, int t) {
		int L = 0, R = ar.length, M = -1;
		while (L < R) {
			M = (L+R)/2;
			if (t == ar[M]) return M;
			if (t > ar[M]) L = M+1;
			else R = M;
		}
		return -1;
	}

}
