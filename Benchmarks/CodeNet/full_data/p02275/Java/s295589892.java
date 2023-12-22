import java.util.Scanner;

/**
 * 
 */

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		int k = 0;
		int n = 0;
		int i = 0;
		int j = 0;
		
		int A[],B[],C[];
		
		n = Integer.parseInt(as.next());
		
		A = new int[n];
		B = new int[n];
		
		for(i=0;i<n;i++){
			
			A[i] = Integer.parseInt(as.next());
			if(k < A[i]){
				
				k = A[i];
				
			}
			
		}
		
		k++;                         //0???????????°?????°????????????
		
		C = new int[k+1];
		
		for(i=0;i<k;i++){
			
			C[i] = 0;
			
		}
		
		for(j=0;j<n;j++){
			
			//System.out.println(A[j]);
			C[A[j]]++;
			
		}
		
		for(i=0;i<k;i++){
			
			C[i+1] = C[i+1] + C[i];
			
		}
		
		for(j=n-1;j>=0;j--){
			
			//System.out.println(C[A[j]]);
			B[C[A[j]]-1] = A[j];
			C[A[j]]--;
			
		}
		
		for(i=0;i<n;i++){
			
			if(i != n){
				
				sb.append(String.valueOf(B[i])).append(" ");
				
			}
			else{
				
				sb.append(String.valueOf(B[i]));
				
			}
			
		}
		
		System.out.println(sb);

	}

}