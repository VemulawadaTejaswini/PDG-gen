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
	for(int i=0;i<p.length-1;i++)
	    {
		for(int j=p.length-1;j>i;j--)
		    {
			if(p[j]>p[j-1])
			    {
				int t=p[j-1];
				p[j-1]=p[j];
				p[j]=t;
			    }
		    }
	    }
	for(int i=0;i<p.length;)
	    {
		if(i==0)
		    {
			
			i+=m-1;
			p[i]=0;
		    }
		else if(i!=0)
		    {
			p[i]=0;
			i+=m;
		    }
	    }
	int sum=0;
for(int i=0;i<p.length;i++)
	    {
		
		
		sum+=p[i];
	    }
System.out.println(sum);

	    }
    }
}