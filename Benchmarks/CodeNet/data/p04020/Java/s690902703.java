import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main (String[] args) throws IOException
    {
    	Scanner sc = new Scanner(System.in);
     
    	int N = sc.nextInt();
    	long a [] = new long [N+1];
    	long ans = 0;
    	
    	a[0] = 0;
    	
    	for (int i = 1 ; i <= N ;i++){
    		a[i] = sc.nextInt();
    	}
    
    	for (int j=1 ; j <= N ; j++ ){
    		
    		
    		if (a[j] % 2 == 0){
    			ans = ans + (a[j] / 2);
    			a[j] = 0;
    			
    		} 
    		else {
    			ans = ans + ((a[j] - 1) / 2);
    			a[j] = 1;

    		}
    	}
        	for (int k=1 ; k <= N-1 ; k++ ){
        		if (a[k] == 1 && a[k+1] == 1){
        			ans = ans + 1;
        			a[k] = 0;
        			a[k+1] =0;

        		}	
        	}
    		
    		
        	System.out.println(ans);
    	
    	
    }	
}
    
   