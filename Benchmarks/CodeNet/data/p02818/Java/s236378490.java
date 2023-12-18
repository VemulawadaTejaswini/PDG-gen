import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	long A, B, K;
	A = sc.nextLong();
	B = sc.nextLong();
	K = sc.nextLong();

	if (A > K) {
	    A -= K;
	} else {
	    K -= A;
	    A = 0;
	    if (B > K) {
		B -= K;
	    } else {
		K -= B;
		B = 0;
	    }
	}

	System.out.println(A + " " + B);
    }
}