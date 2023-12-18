import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		Arrays.sort(B);
		
		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		Arrays.sort(C);

		long ans = 0;
		for (int i = 0; i < N; i++) {
			int b = B[i];
			int ac = lowerBoud(A, b);
			int cc = C.length - upperBound(C, b);
			
			ans += ac * cc;
		}
		
		System.out.println(ans);
    }
    
    static int lowerBoud(int[] m, int key) {
    	int l = -1;
    	int r = m.length;
    	
    	while(l < r) {
    		int mid = (l + r) / 2;
    		
    		if (m[mid] >= key) {
    			r = mid;
    		} else {
    			l = mid+1;
    		} 
    	}
    	
    	return  Math.max(l, 0);
    }
    
    static int upperBound(int[] m, int key) {
    	int l = 0;
    	int r = m.length;
    	
    	while(l < r) {
    		int mid = (l + r) / 2;
    		
    		if (m[mid] >= key) {
    			r = mid;
    		} else {
    			l = mid+1;
    		} 
    	}
    	
    	return Math.max(r, 0);
    }
}