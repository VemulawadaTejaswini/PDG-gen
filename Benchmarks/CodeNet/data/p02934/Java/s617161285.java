import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	int A[] = new int[N];
	double x = 0.0;
	for (int i = 0; i < N; i++) {
	    A[i] = sc.nextInt();
	    x += (1.0 / A[i]);
	}
	System.out.println(1.0 / x);
    }
}