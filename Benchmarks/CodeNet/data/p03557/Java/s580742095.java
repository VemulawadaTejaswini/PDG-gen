import java.util.*;	
public class Main {
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] A  = new double[N+1];
		double[] B  = new double[N];
		double[] C  = new double[N+1];
		A[N]=100001;
		C[N]=100001;
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
	    	while(A[foundA]<B[i]) {
	    	    foundA++;
	    	}
	    	while(C[foundC]<=B[i]) {
	    	    foundC++;
	    	}
	    	count+=foundA*(N-foundC);
	    	foundA=0;
	    	foundC=0;
	     }
	    System.out.println(count);
	  }
	          	
}