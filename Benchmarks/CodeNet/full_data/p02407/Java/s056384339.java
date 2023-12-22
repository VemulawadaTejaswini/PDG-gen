import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	int n;
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	    {
		a[i]=scan.nextInt();
	    }
	int j=0,k=n-1,tmp;
	while(true)
	    {		
		if((j==k) || (j>k))break;
		tmp=a[j];
		a[j]=a[k];
		a[k]=tmp;
		j++;
		k--;
	    }
	for(int i=0;i<n;i++)
	    {
		System.out.println(" "+a[i]);
	
	    }
    }
}