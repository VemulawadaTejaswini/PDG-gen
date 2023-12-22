import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    int[] A = new int[100001];

	    for (int i = 0; i < N; i++) {
	    	int index = Integer.parseInt(scanner.next());
	        A[index]++;
	    }

	    int Q = Integer.parseInt(scanner.next());
	    long sum = 0;
	    for (int i = 0; i < A.length; i++) {
	        sum += i * A[i];
	    }

	    for (int i = 0; i < Q; i++) {
	        int B = Integer.parseInt(scanner.next());
	        int C = Integer.parseInt(scanner.next());
	        sum -= C * A[C];
	        sum -= B * A[B];
	        A[C] += A[B];
	        A[B] = 0;
	        sum += C * A[C];
		    System.out.println(sum);
	    }
	}
}
