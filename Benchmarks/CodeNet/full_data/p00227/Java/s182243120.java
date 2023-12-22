import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
	int n,m;
	n=scan.nextInt();
	m=scan.nextInt();
	if(n==0 && m==0)break;
	int p[]=new int[n];
	for(int i=0;i<n;i++)
	    {
		p[i]=scan.nextInt();
	    }
	for(int i=0;i<n-1;i++)
	    {
		for(int j=n-1;j>i;j--)
		    {
			if(p[j]>p[j-1])
			    {
				int t=p[j-1];
				p[j-1]=p[j];
				p[j]=t;
			    }
		    }
	    }
	
	int sum=0;
	int j=0;
for(int i=1;i<=n;i++)
	    {
		if(i%m!=0)sum+=p[i-1];
		
	    }
System.out.println(sum);

	    }
    }
}