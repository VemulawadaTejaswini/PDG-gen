import java.util.Scanner;

public class Main {

	static int M = 0;
	static int[] A;
	static int[] B;
	static int N = 0;
	static int c = 0;
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    N = Integer.parseInt(scanner.next());
	    M = Integer.parseInt(scanner.next());
	    A = new int[M];
	    B = new int[M];
	    for (int i = 0; i < M; i++) {
	        A[i] = Integer.parseInt(scanner.next());
	        B[i] = Integer.parseInt(scanner.next());
	    }

	    int now = 1;
	    f(1, "1");
        System.out.print(c);
	}

	public static void f(int now, String s) {
		if (s.length() == N) {
		    c++;
		    return;
		}
        for (int i = 0; i < M; i++) {
	        if (now == A[i] && !s.contains(String.valueOf(B[i]))) {
	        	f(B[i], s + String.valueOf(B[i]));
	        } else if (now == B[i] && !s.contains(String.valueOf(A[i]))) {
	        	f(A[i], s + String.valueOf(A[i]));
	        }
	    }
	}
}