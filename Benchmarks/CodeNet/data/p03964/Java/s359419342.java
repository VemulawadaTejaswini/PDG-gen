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
    	int T[] = new int [N+1];
    	int A[] = new int [N+1];
    	int t[] = new int [N+1];
    	int a[] = new int [N+1];
    	
    	for (int i = 1 ; i <= N ; i++){
    		T[i] = sc.nextInt();
    		A[i] = sc.nextInt();
    	}
    	
    	t[1] = T[1];
    	a[1] = A[1];
    	
    	for (int i = 1 ; i <= N-1 ; i++){

    		int flg = 0;
    		for (int n = 1 ; flg == 0 ; n++){
    			if (t[i] <= n * T[i+1] && a[i] <= n * A[i+1]){
    				flg = 1;
    				t[i+1] = n * T[i+1];
    				a[i+1] = n * A[i+1];
    			}
    			
    		}
    		
    		
    	}
    	
    	System.out.println(t[N] + a[N]);
    	
    }	
}
    
   