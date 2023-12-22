import java.util.*;

public class Main {

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis(); 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int[] A = new int[n];
		int[] B = new int[m];
		int[] C = new int[n+m];
		//int cnt = 0;
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			}
		
		for(int i = 0; i < m; i++) {
			B[i] = sc.nextInt();
			}
		
		long time = 0L;

		if(k<A[0] || k<B[0]) {
			System.out.println(0);
			return;
		}
		
		int a = 0;
		int b = 0;
		int t = Math.max(n, m);
		int s = Math.min(n, m);
		
		
			for(int i = 0; i<m+n; i++) {
				if(time <= k) {
					if(a<s && b<s) {
						if(A[a]<=B[b]) {
							time += A[a];
							if(time <= k) a++;
							else break;
						}else {
							time += B[b];
							if(time <= k) b++;
							else break;
						}
					}else if(a==s && b<m) {
						time += B[b];
						if(time <= k) b++;
						else break;
					}else if(a<n && b==s) {
						time += A[a];
						if(time <= k) a++;
						else break;
					}	
					
				
			}
			
			
		} 
			System.out.println(a+b);
			
	      
	}
        
}