import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] Nnumber = new int[N];

        for (int n = 0; n < N; n++) {
        	Nnumber[n] = 1;
        }

        int K = scan.nextInt();
        int i;

        for (i = 1; i <= K; i++) {
        	int d = scan.nextInt();
        	int j;
        	for (j = 1; j <= d; j++) {
        		int A = scan.nextInt();
        		Nnumber[A-1] = 0;
        	}
        }

        int k;
        int count = 0;
        for (k = 0; k < N; k++) {
        	if (Nnumber[k] != 0) {
        		count++;
        	}
        }

		System.out.println(count);

	}
}