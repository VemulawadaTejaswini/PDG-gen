
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception{
    	
    	int[] a = new int[3];
    	int n = 3;
    	
        Scanner in = new Scanner(System.in);
        
        for(int i=0; i<n; i++){
	        int a[i] = in.nextInt();
        }
        
        
        for(int i=0; i<n-1; i++){
        	int min = a[0];
        	int k = i;
        	for(int j=i; j<n; j++){
        		if(min > a[j]){
        			min = a[j];
        			k = j;
        		}
        	}
        	int tmp = a[i];
        	a[i] = a[k];
        	a[k] = tmp;
        	
        	System.out.print(a[i] + " ");
        }
        
    }
    
}