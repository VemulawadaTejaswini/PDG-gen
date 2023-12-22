import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] A = new int[N];
	for (int i=0;i<N;i++) {
	    A[i] = sc.nextInt();
	}
	Arrays.sort(A);
	boolean[] iscount = new boolean[N];
	if(A[0] == A[1]) iscount[0] = true;
	for (int i=1;i<N;i++) {
	    for (int j=0;j<=i-1;j++) {
		if (A[i]%A[j] == 0){
		    iscount[i] = true;
		    break;
		}
	    }
	}
	int count = 0;
	for (int i=0;i<N;i++) {
	    if (! iscount[i]) count++;
	}
	System.out.print(count);
    }
}
