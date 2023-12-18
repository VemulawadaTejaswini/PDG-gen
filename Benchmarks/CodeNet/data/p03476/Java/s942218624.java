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
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 3; i <= max; i++) {
        	if(!primes[i]) continue;
        	if(primes[(i + 1) / 2]) 
        		arr.add(i);
        }
        for(int[] q : qs) {
        	int leftIdx = findUpperBound(arr, q[0]);
        	int rightIdx = findLowerBound(arr, q[1]);
        	System.out.println(rightIdx - leftIdx + 1);
        }
      	
    }

    private static int findUpperBound(ArrayList<Integer> arr, int target) {
    	int left = 0, right = arr.size() - 1;
    	while(left <= right) {
    		int mid = left + (right - left) / 2;
    		if(arr.get(mid) < target)
    			left = mid + 1;
    		else right = mid - 1;
    	}
    	return left;
    }

    private static int findLowerBound(ArrayList<Integer> arr, int target) {
    	int left = 0, right = arr.size() - 1;
    	while(left <= right) {
    		int mid = left + (right - left) / 2;
    		if(arr.get(mid) <= target)
    			left = mid + 1;
    		else right = mid - 1;
    	}
    	return right;
    }
}