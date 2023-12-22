import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		int[] w = new int[n];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
    	for (int i = 0; i < n; i++) {
    		w[i] = sc.nextInt();
    		hm.put(w[i], i);
    	}
    	int[] sort = w.clone();
    	Arrays.sort(sort);
    	
    	int ret = 0;
    	int swap = 0;
    	int swapi = 0;
    	int swapj = 0;
    	while (swap != Integer.MAX_VALUE) {
    		swap = Integer.MAX_VALUE;
    		for (int i = n - 1; i >= 0; i--) {
    			int max = sort[i];
    			int maxi = hm.get(max);
    			if (maxi != i) {
    				if (swap > max + w[i]) {
    					swap = max + w[i];
    					swapi = i;
    					swapj = maxi;
    				}
    			}
    		}
    		if (swap != Integer.MAX_VALUE) {
    			int max = w[swapi];
    			int tmp = w[swapj];
    			w[swapj] = max;
    			hm.put(w[swapj], swapj);
    			w[swapi] = tmp;
    			hm.put(w[swapi], swapi);
    			
    			ret += swap;
    		}
    	}

		System.out.println(ret);
    	
        sc.close();
	}
}