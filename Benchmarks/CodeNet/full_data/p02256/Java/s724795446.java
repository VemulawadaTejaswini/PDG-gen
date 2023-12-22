import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int a,b,c;

	do
	    {
		a = In.nextInt();
		b = In.nextInt();
	    }while(1 >= a && a >= Math.pow(10,9) && 1 >= b && b >= Math.pow(10,9));

	a = a > b ? a:b; 
	b = a < b ? a:b;

	gcd(a,b);
	
    }
	private static void gcd(int a, int b)
	{
	    int n = b;
	    int c;

	    for( c = n; c >=1; c--)
		{
		    if(a % c == 0 && b % c == 0)
			break;
		}
	System.out.println(c);
	}
    
}