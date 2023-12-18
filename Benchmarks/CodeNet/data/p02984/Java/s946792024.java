import java.util.*;

public class Main{

	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] a = new int[n];
      	int sum = 0;
      	int sumF1 = 0;
      	int[] x = new int[n];
      	for(int i = 0; i < n; i++){
        	a[i] = sc.nextInt();
          	sum += a[i];
          	if(i % 2 == 0){
            	sumF1 += a[i];
            }
        }
      	int x[0] = sum - 2 * sumF1;
      	System.out.print(x[0]);
      	for(int i = 1; i < n; i ++){
        	x[i] = 2 * a[i] -x[i-1];
          	System.out.print(x[i] + " ");
        }
      	
      	
    
    }
}