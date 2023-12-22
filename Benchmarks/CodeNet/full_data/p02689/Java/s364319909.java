
import java.util.*;

class Main {
    
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int H[] = new int[N];
        int A[] = new int[N];
        int B[] = new int[N];
        for(int i=0; i<N; i++) {
        	H[i] = sc.nextInt();
        }
        for(int i=0; i<M; i++) {
        	A[i] = sc.nextInt();
        	B[i] = sc.nextInt();        	
        }
        
        boolean[] good = new boolean[N];
        for(int i=0; i<N; i++) {
        	good[i] = true; 
        }
        int ans = 0;
        
        for(int i=0; i<M; i++) {
        	if(H[A[i]-1] < H[B[i]-1]) {
        		good[A[i]-1] = false;
        	}else if(H[A[i]-1] > H[B[i]-1]) {
        		good[B[i]-1] = false;
        	}else {
        		good[A[i]-1] = false;
        		good[B[i]-1] = false;
        	}
        }
        
        for(int i=0; i<N; i++) {
        	if(good[i] == true) ans++; 
        }
        
        System.out.print(ans);
        
       
	}
}
		
	
