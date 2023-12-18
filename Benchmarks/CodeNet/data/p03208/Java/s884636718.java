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
    	int count = 0;
    	int min = 0;
    	for (int i = 1; i < K; i++) {
    		count += hi[i] - hi[i-1];
    	}
    	min = count;
    	for (int i = K; i < N; i++) {
    		count += (hi[i] - hi[i-1]) - (hi[i-(K-1)] -hi[i-K]);
    		if (count < min) {
    			min = count;
    		}
    	}
    	System.out.println(min);
    }
}