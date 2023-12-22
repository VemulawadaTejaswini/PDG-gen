import java.util.*;

public class Main
{
	public static void main(String [] args)
	{

		Scanner input = new Scanner(System.in);
		int a;
		int b;

    	a = input.nextInt();
    	b = input.nextInt();
   	 	System.out.printf("%d\n",gcd(a,b));


	}


	static int gcd(int a,int b)
	{
	    if(b == 0)
	       return a;
	    else
	       return gcd(b, a % b);
	}
}