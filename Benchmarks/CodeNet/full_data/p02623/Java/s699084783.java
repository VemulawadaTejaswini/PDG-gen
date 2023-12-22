import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int M  = keyboard.nextInt();
		long K  = keyboard.nextLong();
		
		long[] A  = new long[N];
		long[] B  = new long[M];
		long Asum = 0;
		long Bsum = 0;
		int ans = 0;
			
		for(int i=0; i<N; i++) {
			A[i] = keyboard.nextInt();
			Asum += A[i];
		}
		
		for(int j=0; j<M; j++) {
			B[j] = keyboard.nextInt();
			Bsum += B[j];
		}
		
		int countA = 0;
		int countB = 0;
		
		if(Asum + Bsum <= K) {
			ans = N+M;
		}else{
			for(int k = 0; k< N+M; k++) {
				if(K > 0) {
					if(A[0] !=0&&A[0]<B[0]) {
						countA++;
						if(A[0] <= K && A[0] !=0) {
						K = K - A[0];
						ans++;
						if(countA<N) {
							A[0] = A[countA];
							}else{
								A[0] = 0;
								}
						}
					}else if(B[0] != 0){
						countB++;
						if(B[0] <= K &&  B[0] != 0) {
						K = K - B[0];
						ans++;
						if(countB<M) {
							B[0] = B[countB];
							}else {
								B[0] = 0;
							}
						}
					}
				}
				
				
				}
			}
		
		System.out.print(ans);
		keyboard.close();	
	}
}