import java.util.Scanner;


public class Main {

    public static boolean checkEven(int[] nArray) {
	boolean flag = true;
	for ( int i=0; i<nArray.length; i++ ) {
	    if ( nArray[i]%2 == 0 ) {
		nArray[i] /= 2;
		continue;
	    }
	    flag = false;
	    break;
	}
	return flag;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n;
	int[] nArray = new int[200];

	n = sc.nextInt();
	for ( int i=0; i<n; i++ ) {
	    nArray[i] = sc.nextInt();
	}

	int cnt = 0;
	while ( true ) {
	    if ( checkEven(nArray) ) {
		cnt++;
		continue;
	    }
	    break;
	}
	System.out.println(cnt);
    }
    
}