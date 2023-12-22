import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] A = new int[N];
	int count = 0;
	for (int i=0;i<N;i++) {
	    A[i] = sc.nextInt();
	    count += A[i];
	}
	Arrays.sort(A);
	count -= A[0];
	System.out.print(count);
    }
}
