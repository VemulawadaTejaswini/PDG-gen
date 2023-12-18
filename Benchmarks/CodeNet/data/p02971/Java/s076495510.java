import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int[] a = new int[n];
      	int[] b = new int[n-1];
      	for(int i = 0; i < n; i ++){
        	a[i] = scan.nextInt();
        }
      	for(int j = 0;j < n; j++){
          	int swap = a[j];
			a[j] = 0;
          	int max = a[0];
          	for(int k = 0; k < n;k++){
            	if(max <= a[k]){
                	max = a[k];
                }
            }
          	a[j] = swap;
          	System.out.println(max);
        }
    }
}