
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int T = Integer.parseInt(scan.next());
	int[] A = new int[N];
	for (int i = 0; i < N; i++) {
	    A[i] = Integer.parseInt(scan.next());
	}

	int max = 0;
	int count = 0;
	for (int i = 0; i < N; i++) {
	    for (int j = i+1; j < N; j++) {
		if(A[j]-A[i] > max) {
		    max = A[j]-A[i];
		    count = 1;
		} else if(A[j]-A[i] == max) {
		    count++;
		}
	    }
	}

	System.out.println(count);
	scan.close();
    }
}
