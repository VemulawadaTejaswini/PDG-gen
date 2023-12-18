

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String []args)
	{
		int a,b,c,x,y;
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			a=cin.nextInt();
			b=cin.nextInt();
			c=cin.nextInt();
			x=cin.nextInt();
			y=cin.nextInt();
			int ans=Math.min(x, y);
			double ave=1.0*(a+b)/2;
			long  mon=0;
			if(ave>c)
			{
				mon+=2*ans*c;
				int mm=x>y?(x-y)*a:(y-x)*b;
				int nn=x>y?(x-y)*2*c:(y-x)*2*c;
				mon+=Math.min(mm,nn);
				
			}
			else 
			{
				mon+=a*x+b*y;
			}
			System.out.println(mon);
			
		}
	}
}