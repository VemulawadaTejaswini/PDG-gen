import java.util.*;


public class Main{
	public static void main( String args[] ) {

		int N;
		int A[];
		int B[];
		boolean isFinish[];
		
		int takahashi,aoki;
		
		
		Scanner scan = new Scanner( System.in );
		N = scan.nextInt();
		
		A = new int[ N  ];
		B = new int[ N  ];
		isFinish = new boolean[ N ];
		for( int i = 0; i < N; i ++ ) {
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
			isFinish[i] = false;
		}
		
		takahashi = 0;
		aoki = 0;
		
		int index;
		int temp;
		boolean isFirst;
		for( int i =0; i < N  ; i++) {
			
			index = -1;
			isFirst = true;
			temp = 0;
			
			if( i %2 == 0 ) {	
				for( int j =0; j < N; j ++) {
					
					if(!isFinish[j] ) {
						
						if( isFirst || temp < A[j] - B[j] ) {
							temp = A[j] - B[j];
							index = j;
						}
						
					}
				}
				takahashi += A[index];
				isFinish[index] = true; 
			}
			else {
				for( int j =0; j < N; j ++) {
					
					if(!isFinish[j] ) {
						
						if( isFirst || temp < B[j] - A[j] ) {
							temp = B[j] - A[j];
							index = j;
						}
						
					}
				}
				aoki += B[index];
				isFinish[index] = true; 
			}
			
			//System.out.println(i + ":" + takahashi + ":" + aoki );
			
			
		}
		
				
		System.out.println( (takahashi - aoki )  );
		
		scan.close();
		
	}
}