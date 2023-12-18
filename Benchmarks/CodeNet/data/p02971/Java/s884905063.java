import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int[] a = new int[n];
      	int dp = 0;
      	int[] b = new int[n];
      	for(int i = 0; i < n; i ++){
        	a[i] = scan.nextInt();
        }
      	int swap = a[0];
      	a[0] = 0;
      	int max = 0;
      	for(int k = 0; k < n;k++){
          max = Math.max(max, a[k]);
        }    
      	dp = max; 
      	System.out.println(max);
      	for(int j = 1;j < n; j++){
          	if(a[j] == dp){
              int max1 = 0;
            	int swap1 = a[j];
      			a[j] = 0;
      			for(int h = 0; h < n;h++){
                  	max1 = Math.max(max1, a[h]);
                }
        	a[j] = swap1;
      		System.out.println(max1);
            if(max1 > dp){
            	dp = max1;
            }
        	}
          	else{
            	System.out.println(dp);
            }
        }
    }
    
}