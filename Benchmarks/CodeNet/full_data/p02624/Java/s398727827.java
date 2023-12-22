/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.math.*;

public class Main
{
    static long Divisor (int n)
    {
        int i;
        long numb=0;
		int m = (int)Math.sqrt(n);
		for (i=1;i<=m ; i++)
		{
		    if (n%i == 0)
		    {
		        int x = n / i;
		        int y = n / x;
		        if(x == y)
		            numb += 1;
		        else
		            numb += 2;
		    }
		}
	    return (numb*n);
    }
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		long res=0;
		for (i=1; i<=n; i++)
		{
		    long x = Divisor(i);
		    long y = x * i;
		    res+=y; 
		}
		int z = 1;
		
		System.out.println(res);
	}
}
