import java.util.*;
 
class Main{
	
    public static void main(String[] args){
 
	Scanner sc = new Scanner(System.in);
 
	int N = sc.nextInt();

	int[] A = new int[N];

	int[] B = new int[N];

	for(int i=0; i<N; i++){
	
	A[i] = sc.nextInt();

	B[i] = A[i];

   }

	

	for(int i=0; i<N; i++){

	A[i] = 1;

	Arrays.sort(A);

	System.out.println(A[N-1]);

	for(int j=0; j<N; j++){
	
	A[j] += B[j]-A[j];
	
	}

   }
   
 
  }
 }