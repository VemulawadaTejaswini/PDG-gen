import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int[] a = new int[n];
      	int dp = 0;
      	int dp1 = 0;
     	int[] b = new int[n];
      	for(int i = 0; i < n; i ++){
        	a[i] = scan.nextInt();
          	b[i] = a[i];
        }
      	scan.close();
      	Arrays.sort(a);
      	dp = a[n-1];
      	dp1 = a[n-2];
      	
      	for(int i = 0; i < n; i ++){
          	if(b[i] == dp){
            	System.out.println(dp1);
            }
          	else{
            	System.out.println(dp);
            }
        }
    }	
}