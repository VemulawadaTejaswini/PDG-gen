





import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 int[] A=new int[N];
	 for(int i=0;i<N;i++) {
		 A[i]=sc.nextInt();
	 }
	 int[] B=new int[N];

     System.arraycopy( A, 0, B, 0, A.length );
	 Arrays.sort(B);
	 for(int i=0;i<N;i++) {
		 

		
		 int max=B[0];
		 for(int index=N-1;index>=0;index--) {
			 if(A[i]==B[index]) {
				
			 }
			 else if(B[index]!=A[i]) {
				 max = B[index];
				 break;
			 }
			 
		 }
		 System.out.println(max);
		
	 }

	 
	 
 }
	


}
