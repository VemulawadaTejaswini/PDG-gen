import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    
	    int[] card = new int[N];
	    for (int i = 0; i < N; i++) {
	      card[i] = sc.nextInt();
	    }
	    
	    Arrays.sort(card);
	    
	    int[] A = new int[M];
	    int[] B = new int[M];
	    for (int i = 0; i < M; i++) {
	    	A[i] = sc.nextInt();
	    	B[i] = sc.nextInt();
	    }
	    
	    for (int i = 0; i < M; i++) {
	    	for(int j = 0;j < A[i];j++) {
	    		if(card[j] < B[i]) {
	    			card[j] = B[i];
	    		}else {
	    			continue;
	    		}
	    	}
	    	Arrays.sort(card);
	    }
	    int ans = 0;
	    for(int a:card) {
	    	ans += a;
	    }
	    System.out.println(ans);
	}
}