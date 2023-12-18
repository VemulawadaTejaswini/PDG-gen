import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    long[] A  = new long[N+1];
	    long[] B  = new long[N];
	    
	    for (int i=0; i<N+1; i++) {
	    	A[i]=Long.parseLong(scanner.next());
	    }
	    for (int i=0; i<N; i++) {
	    	B[i]=Long.parseLong(scanner.next());
	    }
	    
	    long max=0;
	    for (int i=0; i<N; i++) {
	        long b = B[N-i-1];
	        long a1 = A[N-i];
	        long a2 = A[N-i-1];
	        if (a1 >= b) {
	        	max+=b;
	        } else {
	        	max += a1;
	        	b-=a1;
	        	if (a2>=b) {
	        		max+=b;
	        		A[N-i-1] -=b;
	        	} else {
	        		max+=a2;
	        		A[N-i-1] =0;
	        	}
	        }
	    }
        System.out.print(max);
	}

}