import java.util.Scanner;
import java.math.*;

class Main
{

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int n;
	n = in.nextInt();
	for(int i=0;i<n;i++)
	    {
		BigInteger a = in.nextBigInteger().add(in.nextBigInteger());
		
	    
		if(a.toString().length() > 80) System.out.println("overflow");
		else	System.out.println(a.toString());
	    }
    }

}