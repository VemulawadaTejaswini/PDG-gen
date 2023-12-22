import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int a[]=new int[100];
	int i=0;
	while(scan.hasNext())
	    {
		if(i==100)break;
		int x=scan.nextInt();
		int n=0;
		a[x]=n++;
		i++;
	    }
	int max=0,y=0;
	for(int j=0;j<100;j++)
	    {
		if(max<a[j])
		    {
			max=a[j];
			y=j;
			System.out.println(j);
		    }
	    }
    }
}