import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int a[]=new int[10];
	for(int i=0;i<10;i++)
	    {
		a[i]=scan.nextInt();
	    }
	for(int j=1;j<10;j++)
	    {
		int k=j;
		{
		    while(k>=1 && a[k]>a[k-1])
			{
			    int temp=a[k-1];
			    a[k-1]=a[k];
			    a[k]=temp;
			    k--;
			}
		}
	    }
	for(int i=0;i<3;i++)
	    {
		System.out.println(a[i]);
	    }
    }
}