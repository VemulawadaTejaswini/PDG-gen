import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	long[] right = new long[n];
    	long[] left = new long[n];
    	for(int i = 0; i < n; i++) {
    		int k = sc.nextInt();
    		if(i + k < n) {
    			right[i+k]++;
    		}
    		if(i - k >= 0){
    			left[i-k]++;
    		}
    	}
    	long sum = 0;
    	for(int i = 0; i < n; i++) {
    		sum += right[i] * left[i];
    	}
    	System.out.println(sum);
    }
}