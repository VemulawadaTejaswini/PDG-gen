import java.util.Scanner;

class Main {

    public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);

	long N = sc.nextLong();
	long max_x = 1;
	for (long i = 2; i < N / 2; i++) {
	    if ((N % i) == 0)
		max_x = i;
	}
	long max_y = N / max_x;

	System.out.println((max_x - 1) + (max_y - 1));
    }
}