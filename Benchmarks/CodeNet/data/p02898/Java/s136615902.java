import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N, K;
	N = sc.nextInt();
	K = sc.nextInt();

	int h[] = new int[N];
	int count = 0;
	for (int i = 0; i < N; i++) {
	    h[i] = sc.nextInt();
	    if (h[i] >= K)
		count++;
	}

	System.out.println(count);
    }
}