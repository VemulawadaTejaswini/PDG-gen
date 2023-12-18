import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N, K;
	N = sc.nextInt();
	K = sc.nextInt();

	int count = 0;
	do {
	    N = N / K;
	    count++;
	} while (N > 0);

	System.out.println(count);
    }
}