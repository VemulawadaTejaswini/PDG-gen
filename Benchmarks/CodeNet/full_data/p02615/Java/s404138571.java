import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int[] A = new int[N];
      	for (int i=0; i<N; i++) {A[i] = sc.nextInt();};
      	Arrays.sort(A);
      	
        int sum = 0;
      	for (int i=1; i<N; i++) {
        	sum += A[N - 1- i/2];
        }
      	System.out.println(sum);
    }
}