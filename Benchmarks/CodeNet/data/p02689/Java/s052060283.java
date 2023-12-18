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

        int M = scan.nextInt();

        int[] H = new int[N];
        for (int h = 0; h < N; h++) {
        	H[h] = scan.nextInt();
        }

        for (int i = 1; i <= M; i++) {
        	int tenboudai_num1 = scan.nextInt() - 1;
        	int tenboudai_num2 = scan.nextInt() - 1;
        	if (H[tenboudai_num1] > H[tenboudai_num2]) {
        		Nnumber[tenboudai_num2] = 0;
        	} else if (H[tenboudai_num1] < H[tenboudai_num2]) {
        		Nnumber[tenboudai_num1] = 0;
        	} else if (H[tenboudai_num1] == H[tenboudai_num2]) {
        		Nnumber[tenboudai_num1] = 0;
        		Nnumber[tenboudai_num2] = 0;
        	}
        }

        int count = 0;
        for (int k = 0; k < N; k++) {
        	if (Nnumber[k] != 0) {
        		count++;
        	}
        }

		System.out.println(count);

	}
}