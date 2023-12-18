import java.util.*;
public class Main{
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	if(n % 2 == 0) {
    		long sum1 = 0;
    		long sum2 = 0;
    		for(int i = 0 ; i < n ; i++) {
    			if(i % 2 == 0) {
    				sum1 += s.nextInt();
    			}else {
    				sum2 += s.nextInt();
    			}
    		}
    		System.out.println(Math.max(sum1, sum2));
    	}else {
    		long sum1 = 0;
    		long sum2 = 0;
    		int arr1[] = new int[n - (n / 2)];
    		int k = 0;
    		for(int i = 0 ; i < n ; i++) {
    			if(i % 2 == 0) {
    				int t = s.nextInt();
    				sum2 += t;
    				arr1[k] = t;
    				k++;
    			}else {
    				sum1 += s.nextInt();
    			}
    		}
    		Arrays.parallelSort(arr1);
    		sum2 -= (arr1[0]);
    		System.out.println(Math.max(sum1, sum2));
    	}
    }
}