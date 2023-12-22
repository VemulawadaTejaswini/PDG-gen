import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	double a,b,c,d,e,f,x,y;
	while(scan.hasNext())
	    {
		a=scan.nextDouble();
		b=scan.nextDouble();
		c=scan.nextDouble();
		d=scan.nextDouble();
		e=scan.nextDouble();
		f=scan.nextDouble();
		for(Double i=-128.0000;i<128.0000;i++)
		    {
			for(Double j=-128.0000;j<128.0000;j++)
			    {
				if(a*i+b*j==c && d*i+e*j==f)
				    {
					x=i;
					y=j;
					System.out.printf("%.3f %.3f\n",x,y);
				    }
			    }
		    }
	    }
    }
}