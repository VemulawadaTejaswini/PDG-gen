import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int[] A = new int[N];
	for(int i = 0; i < N; i++) {
	    A[i] = in.nextInt();
	}
	insertSort(N, A);
    }

    public static void insertSort(int N, int[] A) {
	show(A);
	for(int i = 1; i < N; i++) {
	    int v = A[i], j = i - 1;
	    while(j >= 0 && A[j] > v) {
		A[j + 1] = A[j];
		j--;
	    }
	    A[j + 1] = v;
	    show(A);
 	}
    }

    public static void show(int[] A) {
	System.out.println(IntStream.of(A)
			       .mapToObj(String::valueOf)
			       .collect(Collectors.joining(" ")));
    }
}

