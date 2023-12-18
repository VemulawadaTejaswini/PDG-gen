import java.util.Scanner;

// Beginner 135 City_Savers still wrong !!!

public class Main {

	static int A[] , B[] ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in) ;
		
		int N = in.nextInt() ;
		
		int i ;
		
		A = new int[N+1] ;
		
		for(i=0;i<N+1;i++) {
			A[i] = in.nextInt() ;
		}
		
		B = new int[N] ;
		
		for(i=0;i<N;i++) {
			B[i] = in.nextInt() ;
		}
		
		int ans = 0 ;
		
		for(i=0;i<N;i++) {
			if(A[i]>B[i]) {
				
				ans += B[i] ;
				
				A[i] -= B[i] ; 
				
				B[i] = 0 ;
				
			}else {
				if(A[i]<B[i]) {
					// check next
					
					ans += A[i] ;
					
					B[i] -= A[i] ;
					
					A[i] = 0 ;
					
					if(A[i+1]>B[i]) {
						
						A[i+1] -= B[i] ;
						
						ans += B[i] ;
						
						B[i] = 0 ;
						
					}else {

						ans += A[i+1] ;
						
						A[i+1] = 0 ;
						
						B[i] -= A[i+1] ;
						
					}
				}else {
					
					ans += B[i] ;
					
					A[i] = 0 ;
					
					B[i] = 0 ;
					
				}
			}
		}
		
		System.out.println(ans);
		
		in.close() ;
	}

}
