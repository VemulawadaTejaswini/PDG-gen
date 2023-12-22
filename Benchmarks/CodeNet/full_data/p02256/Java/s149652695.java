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

	while((c = a%b) > 0)
	    {

		a = b;
		b = c;
	    }
	
	System.out.println(b);
    }
}