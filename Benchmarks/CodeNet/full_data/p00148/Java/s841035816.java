import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext())
	    {
		int n=scan.nextInt();
		n%=39;
		if(n==0)n=39;
		
		System.out.println("3C"+((n<10)?"0"+n:n));
	    }
    }
}