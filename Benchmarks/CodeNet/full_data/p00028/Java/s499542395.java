import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int a[]=new int[100];
	int max=0;
	while(scan.hasNext())
	    {
		int x=scan.nextInt();
		
		a[x]++;
		
		for(int i=0;i<100;i++)
		    {
			if(max<a[i])
			    {
				max=a[i];
			    }
		    }
		
		
	    }
	for(int i=0;i<100;i++)
	    {
		if(a[i]==max)System.out.println(i);
	    }
    }
}