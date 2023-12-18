import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] A = new int[N];
	for(int i = 0; i<N; i++) {
	    A[i] = sc.nextInt();
	}
	Arrays.sort(A);
	for(int i = 0; i<N; i++) {
	    if(A[i] % A[0] != 0) break;
	    if(i == N-1) {
		System.out.println(A[0]);
		return;
	    }
	}
	for(int i = A[0]; i>=1; i--) {
	    if(A[0]%i != 0) continue;
	    for(int j = 1; j<N; j++) {
		if(A[j] % i !=0) break;
		if(j == N-1) {
		    System.out.println(i);
		    return;
		}
	    }
        }
	System.out.println(1);
    }
}