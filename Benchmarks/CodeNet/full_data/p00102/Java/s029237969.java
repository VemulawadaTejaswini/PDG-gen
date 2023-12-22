import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
	int n=scan.nextInt();
	if(n==0)break;
	int num[][]=new int[n+1][n+1];
	for(int i=0;i<n;i++)
	    {
		int sum=0;
		for(int j=0;j<n;j++)
		    {
			num[i][j]=scan.nextInt();
			sum+=num[i][j];
		    }
		num[i][n]=sum;
	    }
	for(int i=0;i<n+1;i++)
	    {
		int sum=0;
		for(int j=0;j<n+1;j++)
		    {
			sum+=num[j][i];
		    }
		num[n][i]=sum;
	    }
	for(int i=0;i<n+1;i++)
	    {
		
		for(int j=0;j<n+1;j++)
		    {
			
			System.out.printf("%5d",num[i][j]);	
		    }
		System.out.println();
	    }
	    }
    }
}