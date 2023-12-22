import java.util.Scanner;
class exe17
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int n,b,f,r,v;
	n=scan.nextInt();
	int a[][][]=new int[4][3][10];
	for(int i=0;i<n;i++)
	    {
		b=scan.nextInt();
		f=scan.nextInt();
		r=scan.nextInt();
		v=scan.nextInt();
		a[b-1][f-1][r-1]=v;
	    }
	for(int i=0;i<4;i++)
	    {
		for(int j=0;j<3;j++)
		    {
			for(int k=0;k<10;k++)
			    {
				System.out.print(" "+a[i][j][k]);
			
			    }
			System.out.println();
		
		    }
		if(i<3)
			    {
			
				System.out.print("####################");
				System.out.println();
			    }
	    }
    }
}