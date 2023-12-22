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
    	for (int i = n - 1; i >= 0; i--) {
    		int max = sort[i];
    		int maxi = hm.get(sort[i]);
    		if (maxi != i) {
    			int tmp = w[i];
//    			int tmpi = hm.get(w[i]);
    			w[i] = max;
    			hm.put(w[i], i);
    			w[maxi] = tmp;
    			hm.put(tmp, maxi);
    			
    			ret += max + tmp;
    		}
    	}

    	System.out.println(ret);
    	
        sc.close();
	}
}