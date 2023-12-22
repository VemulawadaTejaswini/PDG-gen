import java.util.Scanner;
 
public class Main
{
    public static void main(String[] args)
    {
	Scanner cin = new Scanner(System.in);
	while(cin.hasNext())
	{
		double a = cin.nextInt();
		double b = cin.nextInt();
		double c = cin.nextInt();
		double d = cin.nextInt();
		double e = cin.nextInt();
		double f = cin.nextInt();
		double x = (c*e-b*f)/(a*e-b*d);
		double y = (a*f-c*d)/(a*e-b*d);
		System.out.println(x+" "+y);
	}
    }
}