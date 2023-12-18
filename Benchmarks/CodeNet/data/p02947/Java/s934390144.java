import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	String S[] = new String[N];
	char C[][] = new char[N][10];
	int count[] = new int[N];
	for (int i = 0; i < N; i++) {
	    S[i] = sc.next();
	    C[i] = S[i].toCharArray();
	    count[i] = 0;
	}

	for (int i = 0; i < N; i++)
	    Arrays.sort(C[i]);

	boolean bl;
	long sum  = 0;
	for (int i = 0; i < N - 1; i++) {
	    for (int j = i + 1; j < N; j++) {
		bl = true;
		for (int k = 0; k < 10; k++) {
		    if (C[i][k] != C[j][k])
			bl = false;
		}
		if (bl) {
		    count[i]++;
		}
	    }
	    sum += count[i];
	}

	System.out.println(sum);
    }
}