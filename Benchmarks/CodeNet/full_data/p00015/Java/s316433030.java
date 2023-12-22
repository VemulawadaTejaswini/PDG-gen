import java.util.Scanner;
import java.math.*;

class Main
{

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int n;
	BigInteger a,b;
	n = in.nextInt();
	for(int i=0;i<n;i++)
	    {
		a = in.nextBigInteger();
		b = in.nextBigInteger();
		a.add(b);
		if(a.toString().length() > 80) System.out.println("overflow");
		else	System.out.println(a.toString());
	    }
    }

}