/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int i;
		n = n + 1;
		int []a = new int[n];
		int []b = new int [n];
		for(i=1; i<n; i++)
		    a[i] = sc.nextInt();
		int p = 0;
	    for(i=1; i<n; i++)
	    {
	        if(i == 1)
	        {
	            b[i] = a[i];
	            p = a[i];
	        }
	        else
	        {
	            b[i] = a[p];
	            p = a[p];
	        }
	    }
	    long y = k % (long)(n-1);
	    
	    int x = (int)y;
	    p = b[x];
	    System.out.println(p);
    }
}