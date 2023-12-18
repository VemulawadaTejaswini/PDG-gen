import java.util.Scanner;


public class Main {

    public static int getSum(int x) {
	int sumv = 0;
	while ( true ) {
	    sumv += x%10;
	    x /= 10;
	    if ( x == 0 ) break;
	}
	return sumv;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int a = sc.nextInt();
	int b = sc.nextInt();

	int sumv = 0;
	for ( int x=1; x<n+1; x++ ) {
	    int y = getSum(x);
	    if ( a <= y && y <= b ) {
		sumv += x;
	    }
	}
	System.out.println(sumv);
    }

}