import java.util.Scanner;

class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	long A, B;

	A = sc.nextLong();
	B = sc.nextLong();

        if ((A - B) % 2 == 0) {
	    long C = A - B;
	    if (C < 0) {
		C *= -1;
		System.out.println((C / 2) + A);
	    } else {
		System.out.println((C / 2) + B);
	    }
	} else {
	    System.out.println("IMPOSSIBLE");
	}
    }
}