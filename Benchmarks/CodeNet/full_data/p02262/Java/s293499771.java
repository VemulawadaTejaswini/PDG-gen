import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		shellSort(A, n);
	}
	public static int insertionSort(int[] A, int n, int g, int cnt) {
	    for (int i = g; i < n; i++) {
	        int v = A[i];
	        int j = i - g;
	        while (j >= 0 && A[j] > v) {
	            A[j+g] = A[j];
	            j = j - g;
	            cnt++;
	        }
	        A[j+g] = v;
	    }
	    return cnt;
	}

	public static void shellSort(int[] A, int n) {
	    int cnt = 0;
	    int m = 1;
	    for (int tmp = 1; m < n; m++) {
	    	tmp = tmp * 3 + 1;
	    	if (n < tmp) break;
	    }
	    int[] G = new int[m];
	    G[m-1] = 1;
	    for (int i = m - 2; i >= 0; i--) {
	    	G[i] = G[i+1] * 3 + 1;
	    }
	    for (int i = 0; i < m; i++) {
	        cnt = insertionSort(A, n, G[i], cnt);
	    }

	    out.println(m);
	    StringBuilder sb = new StringBuilder();
	    for (int x : G) {
	    	sb.append(x).append(' ');
	    }
	    out.println(sb.toString().trim());
	    out.println(cnt);
	    for (int x : A) {
	    	out.println(x);
	    }
	}
}