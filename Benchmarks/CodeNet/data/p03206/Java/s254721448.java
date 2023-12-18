import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    int K = Integer.parseInt(scanner.next());
	    int[] H = new int[N];

	    for (int i=0; i<N; i++) {
	    	H[i] = Integer.parseInt(scanner.next());
	    }
	    
	    Arrays.parallelSort(H);
	    
	    int min=Integer.MAX_VALUE;
	    for (int i=0; i<N-K +1; i++) {
	    	int t= H[i+K-1] - H[i];
	    	if (t < min) {
	    		min=t;
	    	}
	    }

	    System.out.println(min);
	}
}