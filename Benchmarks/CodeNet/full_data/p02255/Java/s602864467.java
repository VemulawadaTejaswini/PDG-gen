import java.util.*;

class A{
    final static public int N = 1000;

    public static void trace(int []A, int n){
	for (int i = 1; i <= n; i++ ){
	    if ( i > 1 ) System.out.print(" ");
	    System.out.print(A[i]);
	}
	System.out.println();
    }
    public static void main(String[] args) throws IOException {
	int i, j, key;
	int []A = new int[N+1];
	Scanner s = new Scanner(System.in);
	
	int n = s.nextInt();
	for (i = 1; i <= n; i++ ) A[i] = s.nextInt();
	for(i=1 ; i < n+1 ; i++){
	    key = A[i];
	    j = i - 1;
	    while( j >= 0 && A[j] > key){
		A[j+1] = A[j];
		j--;
		A[j+1] = key;
	    }
	    trace(A,n);
	}
    }
}