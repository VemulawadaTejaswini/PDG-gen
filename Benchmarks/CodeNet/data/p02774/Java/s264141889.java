import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	long k = sc.nextLong();
    	long a[] = new long[n];
      for (int i=0; i<n;i++) {
        a[i]= sc.nextLong();
      }
   	long L = Long.MIN_VALUE;
    	long R = Long.MAX_VALUE;
    	Arrays.sort(a);

    	while (L + 1 < R) {
    		long MID = (L + R) / 2;
    		long cnt = 0;
    		for (int i = 0; i < n; i++) {
    			if (a[i] < 0) {
    				int l = i;
    				int r = n;
    				while (l + 1 < r) {
    					int mid = (l + r) / 2;
    					if (a[i] * a[mid] <= MID) {
    						r = mid;
    					} else {
    						l = mid;
    					}
    				}
   					cnt += n - r;
    			} else {
    				int l = i;
    				int r = n;
    				while (l + 1 < r) {
    					int mid = (l + r) / 2;
    					if (a[i] * a[mid] <= MID) {
    						l = mid;
    					} else {
    						r = mid;
    					}
    				}
   					cnt += l - i;
    			}
    		}
    		if (cnt < k) {
    			L = MID;
    		} else {
    			R = MID;
    		}
    	}
    	System.out.println(R);
	}
}



