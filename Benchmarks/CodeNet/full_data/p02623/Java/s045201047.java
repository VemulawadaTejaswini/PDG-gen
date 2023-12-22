import java.util.*;
 
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int K = sc.nextInt();
	int[] A = new int[N+1];
	int[] B = new int[M+1];
	for (int i=0;i<N;i++) A[i] = sc.nextInt();
	for (int i=0;i<M;i++) B[i] = sc.nextInt();
	A[N] = Integer.MAX_VALUE;
	B[M] = Integer.MAX_VALUE;
	int countM = 0;
	int cou = 0;
	int a = 0;
	int b = 0;
	for (int i=0;i<N+M;i++) {
	    if (a < N && b < M) {
		if (A[a]< B[b]) {
		    if (countM + A[a] <= K) {
			countM += A[a];
			a++;
		    } else {
			break;
		    }
		} else {
		    if (countM + B[b] <= K) {
			countM += B[b];
			b++;
		    } else {
			break;
		    }
		}
		cou++;
	    } else if (b == M) {
		if (countM + A[a] <= K) {
		    countM += A[a];
		    a++;
		    cou++;
		} else {
		    break;
		}
	    } else if (a == N) {
		if (countM + B[b] <= K) {
		    countM += B[b];
		    b++;
		    cou++;
		} else {
		    break;
		}
	    }
	}
	System.out.print(cou);
    }
}
