import java.util.*;
import java.text.*;

public class Main {

	public static void bfs(double a,double b,double c,double d,double e,double f)
	{
		double x,y;
		if(a==0||e==0)
			{
			x=f/d;
			y=c/b;		
			}
		else if(b==0||d==0)
		{
			x=c/a;
			y=f/e;
		}
		else
		{
			x=(c-b*f/e)/(a-b*d/e);
			y=(c-a*f/d)/(b-a*e/d);
		}
		DecimalFormat df =new DecimalFormat(); 
		df.setMinimumFractionDigits(3);
		
		
		System.out.print(df.format(x)+" "+df.format(y));
		
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double a,b,c,d,e,f;
		while(scan.hasNext()){
		a=scan.nextDouble();
		b=scan.nextDouble();
		c=scan.nextDouble();
		d=scan.nextDouble();
		e=scan.nextDouble();
		f=scan.nextDouble();
		bfs(a,b,c,d,e,f);
		}
}}