import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	float a,b,c,d,e,f,x,y;
	while(scan.hasNext())
	    {
		a=scan.nextFloat();
		b=scan.nextFloat();
		c=scan.nextFloat();
		d=scan.nextFloat();
		e=scan.nextFloat();
		f=scan.nextFloat();
		for(float i=-128;i<128;i++)
		    {
			for(float j=-128;j<128;j++)
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