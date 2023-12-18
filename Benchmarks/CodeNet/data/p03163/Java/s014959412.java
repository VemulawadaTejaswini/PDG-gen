import java.io.*;
//import javafx.util.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args)  {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t = Integer.parseInt(br.readLine());
//		while(t-->0)
//		{
//		  int totItems = Integer.parseInt(br.readLine()); //no.of items.
//		  int n = Integer.parseInt(br.readLine()); //capacity of knapsack.
//		  int val[] = new int[totItems]; //values of items.
//		  int wt[] = new int[totItems]; //weights of items.
//		  
//		  
//		  for(int i=0;i<totItems;i++){
//            String s1[]= br.readLine().split(" ");
//		    val[i] = Integer.parseInt(s1[i]);
//            wt[i] = Integer.parseInt(s1[i]);
//          }
		    
		   // String s2[]= br.readLine().split(" ");
		//  for(int i=0;i<;i++)
		  //  wt[i] = Integer.parseInt(s2[i]);
		Scanner sc =new Scanner(System.in);
		int totItems=sc.nextInt();
		int n=sc.nextInt();
		int val[]=new int [totItems];
		int wt[]=new int [totItems];
		for(int i=0;i<totItems;i++) {
		 wt[i]=sc.nextInt();
		val[i]=sc.nextInt();
		}
		    findMaxProfit(totItems,n,val,wt);
		  
		
	}
	
	static void findMaxProfit(int totItems,int n,int val[],int wt[])
	{
	    long dp[][] = new long[n+1][totItems+1];
	   //IMP:-Top X-axis - > Capacity from 0....to n.    Draw graph to visualise.
	    //    Y-axis - > Items from 0...to totItems.
	    
	    //First row and first column is filled with 0's.
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=totItems;j++)
	        {
	           //If the weight of the item is less than or equal to the capacity.
	            if(wt[j-1]<=i) {
	   /*IMP:-  Take the max of(val of cur_item + (DP answer -> [cur_capacity 
	            -weight of cur_item][above item/cell]) 
	                                AND 
	            (DP answer -> dp[same capacity][above item/cell] */
 
	            dp[i][j] = Math.max(val[j-1]+dp[i-wt[j-1]][j-1] , dp[i][j-1]);   }
	            
	            else
	            dp[i][j] = dp[i][j-1];
	        }
	    }
	    //Gives the max value obtained for the capacity n considering all the items.
	    System.out.println(dp[n][totItems]) ;  
	}
}