import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int A = sc.nextInt();
	    int B = sc.nextInt();

	    int ans = 0;

	    while (N > A) {

	    	N -= A;
	    	ans += A;

	    	if ( N >= B) {
	    		N -= B;
	    	}
	    }

	    ans += N;

	    System.out.println(ans);
		}
}