import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    double[] S  = new double[N];
	    
	    for (int i=0; i<N; i++) {
	        S[i]= Double.parseDouble(scanner.next());
	    }
	    
	    Arrays.parallelSort(S);

	    double m=(S[0] + S[1]) /2;
        for (int i=2; i<N; i++) {
	        m = (m+S[i]) / 2;
	    }

        System.out.print(m);
	}

}