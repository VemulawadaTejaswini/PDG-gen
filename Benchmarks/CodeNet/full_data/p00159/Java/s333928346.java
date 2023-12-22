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
		
		
		
		int ans=0,x=0,near=0,j=0;
		for(int i=0;i<n;i++)
		    {
			int num=scan.nextInt();
			int w;
			double h;
			h=scan.nextDouble()/100;
			w=scan.nextInt();
			int bmi=(int)((double)w/(h*h));
			if(i==0)ans=num;
			
			if(bmi>=22)x=bmi-22;
			else x=22-bmi;
			near=Integer.MAX_VALUE;
			if(near>x)
			    {
				near=x;
				ans=num;
				
			    }
		    }
		System.out.println(ans);
	    }
    }
}