/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long []a = new long[n];
		long ans = 1;
		int i;
		long y = (long)Math.pow(10,18);
		for(i=0; i<n; i++)
		    a[i] = sc.nextLong();
		for(i=0; i<n; i++)
		{
		    long x = a[i];
		    ans = ans * x;
		    
		    if(ans > y)
		    {
		        ans = -1;
		        break;
		    }
		}
		System.out.println(ans);
		
	}
}
