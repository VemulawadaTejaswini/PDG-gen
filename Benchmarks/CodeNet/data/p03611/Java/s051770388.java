import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int []a = new int [n];
       
       for(int i = 0; i< n ;i++) {
    	   a[i] = sc.nextInt() - 1;
       }
       Arrays.sort(a);
       
       int maxnum = a[n-1];
       int max = 0;
       
       for(int i = a[0] ; i <= maxnum; i++) {
    	   int tmp = 0;
    	   for(int j = 0; j < n ; j++) {
    		   if((a[j] - i) <= 2 && (a[j] - i) >= 0) {
    			   tmp++;
    		   }
    	   }
    	   max = Math.max(max, tmp);
    	  }
       System.out.println(max);
	}

}
