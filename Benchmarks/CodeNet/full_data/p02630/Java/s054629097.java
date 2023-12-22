import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] A = new int[N];
	int sum = 0;
	for (int i=0;i<N;i++) {
	    A[i] = sc.nextInt();
	    sum += A[i];
	}
	int Q = sc.nextInt();
	StringBuilder sb = new StringBuilder();
	for (int i=0;i<Q;i++) {
	    int B = sc.nextInt();
	    int C = sc.nextInt();
	    int countB = 0;
	    for (int j=0;j<N;j++) {
		if (A[j] == B){
		    countB++;
		    A[j] = C;
		}
	    }
	    sum = sum - countB*(B-C);
	    if (i == Q-1) sb.append(sum);
	    else sb.append(sum + "\r\n");
	}
	System.out.print(sb.toString());
    }
}