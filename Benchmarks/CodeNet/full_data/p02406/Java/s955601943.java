import java.util.Scanner;

class Main {
    static public void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();

	for(int i=1; i<=n; i++) {
	    int x = i;
	    if (x % 3 == 0) {
		System.out.print(" "+i);
	    } else {
		do {
		    if (x % 10 == 3) {
			System.out.print(" "+i);
			break;
		    }
		    x /= 10;
		} while (x>0);
	    }
	}
	System.out.print("\n");
    }
}	
					    