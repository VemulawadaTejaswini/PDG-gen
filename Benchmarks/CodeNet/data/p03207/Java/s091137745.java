import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A [] = new int [N];
	    
	    for(int i = 0; i < N; i++) {
	    	A[i]=sc.nextInt();
	    }
	    sc.close();
	    Arrays.sort(A);
	    
	    int total = 0;
	    for(int i = 0; i < N-1; i++) {
	    	total+=A[i];
	    }
	    System.out.println(total+A[N-1]/2);

	}

}
