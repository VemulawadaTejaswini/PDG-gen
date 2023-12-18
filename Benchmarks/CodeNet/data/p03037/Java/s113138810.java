import java.util.Scanner;

class Main {

    public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);

	int N, M;
	N = sc.nextInt();
	M = sc.nextInt();

	int L[] = new int[M];
	int R[] = new int[M];
	for (int i = 0; i < M; i++) {
	    L[i] = sc.nextInt();
	    R[i] = sc.nextInt();
	}

	int l = L[0];
	int r = R[0];
	for (int i = 1; i < M; i++) {
	    if (L[i] > l)
		l = L[i];
	    if (R[i] < r)
		r = R[i];
	}

	System.out.println(r - l + 1);
    }
}