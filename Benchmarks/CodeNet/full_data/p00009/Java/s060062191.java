import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	boolean isPrime;
	int i,j;

	while (scan.hasNext()) {
	    int count = 0;
	    int n = scan.nextInt();

	    for (i=2; i<=n; i++) {
		isPrime = true;
		for (j=2; j<i; j++) {
		    if (i%j == 0) {
			isPrime = false;
			break;
		    }
		}
		if (isPrime) {
		    count++;
		}
	    }

	    System.out.println(count);
	}
    }
}