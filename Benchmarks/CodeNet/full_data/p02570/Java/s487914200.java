import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner sc = new Scanner(System.in);
		    double t,d,s;
		    d=sc.nextDouble();
		    t=sc.nextDouble();
		    s=sc.nextDouble();
		    if((d/s)<=t)
		     System.out.println("Yes");
		     else
		     System.out.println("No");
		} catch(Exception e) {
		}
	}
}
