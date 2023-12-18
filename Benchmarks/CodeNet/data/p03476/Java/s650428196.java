import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] qs = new int[n][2];
        int max = 0;
        for(int i = 0; i < n; i++) {
        	qs[i][0] = sc.nextInt();
        	qs[i][1] = sc.nextInt();
        	max = Math.max(max, qs[i][1]);
        }
        boolean[] primes = new boolean[max + 1];
        Arrays.fill(primes, true);
        for(int i = 2; i <= max; i++) {
        	if(!primes[i]) continue;
        	for(int j = i * 2; j <= max; j = j + i) {
        		primes[j] = false; 
        	}
        }
        int[] preSum = new int[max + 1];
        for(int i = 3; i <= max; i++) {
        	preSum[i] = preSum[i-1];
        	if(primes[i] && primes[(i + 1) / 2]) 
        		preSum[i]++;
        }

      	for(int[] q : qs) {
      		System.out.println(preSum[q[1]] - preSum[q[0] - 1]);
      	}
    }
}
