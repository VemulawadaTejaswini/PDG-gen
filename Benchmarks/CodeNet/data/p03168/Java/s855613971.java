/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    
    public static double MoreHead(float []pro , int curr_ind , int head , int n){
        if(curr_ind>n){
        if(head>( n - head)){
            return 1;
        }else{
            return 0;
        }
        }
        return (pro[curr_ind]*(MoreHead(pro , curr_ind+1 , head+1 , n)) + (1 - pro[curr_ind])*(MoreHead(pro , curr_ind+1 , head , n)));
        
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = sc.nextInt();
		float []pro = new float[n+1];
		for(int i =1;i<=n;i++){
		   pro[i] = sc.nextFloat(); 
		   }
		   
		   System.out.println(MoreHead(pro,1,0 , n));
	}
}
