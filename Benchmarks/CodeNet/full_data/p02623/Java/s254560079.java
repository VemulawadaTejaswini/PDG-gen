import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N+1];
        for (int i = 0; i < N+1; i++) {
        	if (i == 0) {
        		A[0] = Integer.MAX_VALUE;
        		continue;
        	}
        	int Ai = sc.nextInt();
        	A[i] = Ai;
        }
        int[] B = new int[M+1];
        for (int i = 0; i < M+1; i++) {
        	if (i == 0) {
        		B[0] = Integer.MAX_VALUE;
        		continue;
        	}
        	int Bi = sc.nextInt();
        	B[i] = Bi;
        }
        int indexA = 1;
        int indexB = 1;
        int count = 0;
        while (true) {
        	if (indexA == N+1) {
        		indexA = 0;
        	}
        	if (indexB == M+1) {
        		indexB = 0;
        	}
        	if (indexA == 0 && indexB == 0) {
        		break;
        	}
        	if (A[indexA] <= B[indexB]) {
        		if (K < A[indexA]) {
        			break;
        		} else {
        			K -= A[indexA];
        			count++;
        			indexA++;
        		}
        	} else if (B[indexB] < A[indexA]) {
        		if (K < B[indexB]) {
        			break;
        		} else {
        			K -= B[indexB];
        			count++;
        			indexB++;
        		}
        	}
        }
        System.out.println(count);
    }
}