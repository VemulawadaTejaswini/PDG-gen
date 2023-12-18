import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int A = Integer.parseInt(scanner.next());
	    int B = Integer.parseInt(scanner.next());

	    if (B<A) {
	    	A=A^B;
	    	B=A^B;
	    	A=A^B;
	    }
	    int r = 0;
	    int a=A;
	    int b=B;
	    while(true) {
	        int y = b%a;
	        if (y == 0) {
	        	r = a;
	        	break;
	        } else {
	        	b = a;
	        	a = y;
	        }
	    }


        System.out.print(A*B/r);
	}

}
