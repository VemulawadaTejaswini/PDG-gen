import java.util.*;	
public class Main {
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] A  = new double[N];
		double[] B  = new double[N];
		double[] C  = new double[N];
		int count = 0;
		int foundA=0;
		int foundC=0;
	    for(int i=0; i<N; i++) {
			A[i]=sc.nextInt();			
	    }
	    for(int i=0; i<N; i++) {
			B[i]=sc.nextInt();			
	    }
	    for(int i=0; i<N; i++) {
			C[i]=sc.nextInt();			
	    }
	    Arrays.sort(A);
	    Arrays.sort(B);
	    Arrays.sort(C);
	    for(int i = 0; i<N; i++) {
	    	foundA=Arrays.binarySearch(A,B[i]-0.1);
	    	foundC=Arrays.binarySearch(C,B[i]+0.1);
	    	count+=(-foundA-1)*(N-(-(foundC+1)));
	     }
	    System.out.println(count);
	  }	          	
}