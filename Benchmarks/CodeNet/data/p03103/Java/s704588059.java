import java.util.*;
public class Main121 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int M = sc.nextInt();
		
		long[] A = new long[N];
		
		long[] B = new long[N];
		
		for(int i=0;i<N;i++){
			
			A[i] = sc.nextLong();
			
			B[i] = sc.nextLong();
		}
		
		for(int i=0;i<N-1;i++){
			
			for(int j=i+1;j<N;j++){
				
				if(A[j]<A[i]){
					
					long tempA = A[i];
					
					A[i] = A[j];
					
					A[j] = tempA;
					
					long tempB = B[i];
					
					B[i] = B[j];
					
					B[j] = tempB;
									
				}
			}
		}
		
		long ans = 0;
		
		long k = 0;
		
		int i = 0;
		
		while(k<M){
			
			if(k+B[i]<=M){
				
				ans += A[i]*B[i];
				
				k += B[i];
								
			}else{
				
				for(;k<M;k++){
					
					ans += A[i];
									}
			}
			i++;
		}
		System.out.println(ans);
				
	}
	
	
}
