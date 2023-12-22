import java.util.*;
 
public class Main {
	public static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int AK = K;
        int countA = 0;
        long[] A = new long[N+1];
        for (int i = 0; i < N+1; i++) {
        	if (i == 0) {
        		A[i] = 0;
        	} else {
            	long Ai = sc.nextLong();
            	A[i] = Ai+A[i-1];
        	}
        }
        int BK = K;
        int countB = 0;
        long[] B = new long[M+1];
        for (int i = 0; i < M+1; i++) {
        	if (i == 0) {
        		B[i] = 0;
        	} else {
            	long Bi = sc.nextLong();
            	B[i] = Bi+B[i-1];
        	}
        }
        for (int i = 0; i < N+1; i++) {
        	long Ai = A[i];
        	if (K < Ai) {
        		break;
        	}
        	int j = 0;
        	for (; j < M+1; j++) {
        		long Bi = B[j];
        		if (K < Ai+Bi) {
        			break;
        		}
        	}
        	if (max < i+j) {
        		max = i+j;
        	}
        }
        System.out.println(max-1);
    }
}