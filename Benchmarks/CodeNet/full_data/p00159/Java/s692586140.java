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
		int ans=0;
		double x=Double.MAX_VALUE;
		for(int i=0;i<n;i++)
		    {
			int num=scan.nextInt();
			double h,w;
			h=scan.nextDouble()/100.0;
			w=scan.nextDouble();
			
			if(x>Math.abs(w/h*h-22))
			    {
				x=Math.abs(w/h*h-22);
				ans=num;
			    }
		    }
		System.out.println(ans);
	    }
    }
}