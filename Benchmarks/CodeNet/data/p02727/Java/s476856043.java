
import java.util.Arrays;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x,y,r,g,c,countr=0,countg=0,countc=0,sum=0;
	x=sc.nextInt();
	y=sc.nextInt();
	r=sc.nextInt();
	g=sc.nextInt();
	c=sc.nextInt();
	Integer red[]=new Integer[r];
	Integer green[]=new Integer[g];
	Integer colorless[]=new Integer[c];
	for(int i=0;i<r;i++)
	{
		red[i]=sc.nextInt();
	}
	Arrays.sort(red);
	for(int i=0;i<g;i++)
	{
		green[i]=sc.nextInt();
	}
	Arrays.sort(green);
	for(int i=0;i<c;i++)
	{
		colorless[i]=sc.nextInt();
	}
	Arrays.sort(colorless);
	
	for(int i=0;i<x+y;i++)
	{
		if(red[r-1]>green[g-1] && red[r-1]>colorless[c-1] && countr<x)
		{
			sum+=red[r-1];
			countr++;
			r=r-1;
			if(r<=0)
			{
				red[0]=0;
				r=1;
			}
		}
		else if(green[g-1]>colorless[c-1] && countg<y)
		{
			sum+=green[g-1];
			countg++;
			g=g-1;
			if(g<=0 || countg==y)
			{
				green[0]=0;
				g=1;
			}
		}
		else
		{
			sum+=colorless[c-1];
			c=c-1;
			if(c<=0)
			{
				colorless[0]=0;
				c=1;
			}
		}
	}
	System.out.println(sum);
}
}
