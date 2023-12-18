public class Main
{
	public static void main(String args[])
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		double h=sc.nextDouble();
		double a=sc.nextDouble();
		int x=(int)Math.ceil((h/a));
		System.out.println(x);
	}
}