import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext())
	    {
	int n=scan.nextInt();
	int i=0,field=0;
	if(n==1 || n==2)
	    {
		field=2*n;
	    }
	else
	    {
		field=4;
		for(i=2;i<=n-1;i++)
		    {
			field+=i;
			
		    }
		field+=n-2;
		
		
		
	    }
	System.out.println(field);
	    }
    }
}