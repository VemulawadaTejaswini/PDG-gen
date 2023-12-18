import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    
	    long[] card = new long[N];
	    for (int i = 0; i < N; i++) {
	      card[i] = sc.nextLong();
	    }
	    
	    Arrays.sort(card);
	    
	    long[] A = new long[M];
	    long[] B = new long[M];
	    for (int i = 0; i < M; i++) {
	    	A[i] = sc.nextLong();
	    	B[i] = sc.nextLong();
	    }
	    
	    for (int i = 0; i < M; i++) {
	    	for(int j = 0;j < A[i];j++) {
	    		if(card[j] < B[i]) {
	    			card[j] = B[i];
	    		}else {
	    			break;
	    		}
	    	}
	    	Arrays.sort(card);
	    }
	    long ans = 0;
	    for(long a:card) {
	    	ans += a;
	    }
	    System.out.println(ans);
	}
}