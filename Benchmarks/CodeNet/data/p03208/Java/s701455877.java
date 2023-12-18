import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	int[] hi = new int[N];
    	for (int i = 0; i < N; i++) {
    		hi[i] = sc.nextInt();
    	}
    	Arrays.sort(hi);
    	int high = hi[K-1] - hi[0];
    	int min = high;
    	for (int i = K; i < N; i++) {
    		high = hi[i] - hi[i-K+1];
    		if (high < min) {
    			min = high;
    		}
    	}
    	System.out.println(min);
    }
}