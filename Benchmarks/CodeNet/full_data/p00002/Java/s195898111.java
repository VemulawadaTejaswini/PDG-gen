import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int a,b;
	while(scan.hasNext())
	    {
	a=scan.nextInt();
	b=scan.nextInt();
	String str=Integer.toString(a+b);
	System.out.println(str.length());
	    }
    }
}