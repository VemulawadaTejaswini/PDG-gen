import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    int[] A = new int[N];

	    for (int i=0; i<N; i++) {
	    	A[i] = Integer.parseInt(scanner.next());
	    }

	    int max = Integer.MAX_VALUE;
	    for (int i=0; i<N-1; i++) {
	    	int a = uclid(A[i], A[i+1]);
	    	if (max > a) {
	    		max=a;
	    	}
	    }
	    
	   
	    System.out.println(max);
	}
	
	public static int uclid(int m, int n) {
		if (m<n) {
			m ^= n;
			n^=m;
			m^=n;
		}
		
		while (true) {
			int t=m%n;
			if (t==0) {
				return n;
			} else {
				m=n;
				n=t;
			}
		}
	}

}