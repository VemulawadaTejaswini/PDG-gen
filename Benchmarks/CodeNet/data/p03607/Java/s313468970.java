import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static Scanner sc ;
	public static void main (String[] args) throws java.lang.Exception
	{
	    sc = new Scanner(System.in) ;
	    int n = sc.nextInt() ;
	    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>() ;
	    for(int i = 0 ; i<n ; i++)
	    {
	        int x = sc.nextInt() ;
	        if(hm.containsKey(x))
	        {
	            hm.put(x,hm.get(x)^1) ;
	        }
	        else
	        {
	            hm.put(x,1) ;    
	        }
	    }
	    int ctr = 0 ;
	    for(int key : hm.keySet())
	    {
	        ctr+=hm.get(key) ;
	    }
	    System.out.println(ctr) ;
	}
}