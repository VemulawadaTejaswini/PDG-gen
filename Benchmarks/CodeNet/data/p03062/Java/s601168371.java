import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[] a = new long[n];
		long sum = 0;
		int count = 0;
		int minusCount = 0;
		
		for(int i=0; i<n; i++) {
		    a[i] = Long.parseLong(sc.next());
		    if(a[i] < 0) {sum += -a[i]; minusCount++;} 
		    else sum += a[i];
		}
    	
    	for(int i=0; i<n; i++) {
		    if(a[i] < 0) {
		        if(i < n-2) {
		            if(a[i+1] < 0) {
		                a[i] = -a[i];
		                a[i+1] = -a[i+1];
		                minusCount -= 2;
		            }else if(a[i+2] < 0) {
		                a[i] = -a[i];
		                a[i+2] = -a[i+2];
		                minusCount -= 2;
		            }else {
    		            a[i] = -a[i];
    		        }
		        }else if(i == n-2) {
		            if(a[i+1] < 0) {
		                a[i] = -a[i];
		                a[i+1] = -a[i+1];
		                minusCount -= 2;
		            }else {
    		            a[i] = -a[i];
    		        }
		        }else {
		            a[i] = -a[i];
		        }
		    }
		}
		
		Arrays.sort(a);
		for(int i=0; i<minusCount; i++) {
		    sum -= a[i]*2;
		}
        
        System.out.println(sum);
	}
}