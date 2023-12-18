import java.io.*;
import java.util.Arrays;
import java.util.Collections;
class Main
{
  public static void main(String args[])throws Exception
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int x,y,a,b,c;
    x=Integer.parseInt(br.readLine());
    y=Integer.parseInt(br.readLine());
    a=Integer.parseInt(br.readLine());
    b=Integer.parseInt(br.readLine());
    c=Integer.parseInt(br.readLine());
    Integer red[]=new Integer[a];
    Integer green[]=new Integer[b];
    Integer colour[]=new Integer[c];
    for(int i=0;i<a;i++)
    {
      red[i]=Integer.parseInt(br.readLine());
    }
    for(int i=0;i<b;i++)
    {
      green[i]=Integer.parseInt(br.readLine());
    }
    for(int i=0;i<c;i++)
    {
      colour[i]=Integer.parseInt(br.readLine());
    }
	int total=0,f=0,ce=0;
	Arrays.sort(red,Collections.reverseOrder());
	Arrays.sort(green,Collections.reverseOrder());
	Arrays.sort(colour,Collections.reverseOrder());
	for(int i=0;i<x;i++)
	{
		f=0;
		for(int j=0;j<c;j++)
		{
			if(red[i]>=colour[j])
				f++;
			else
			{
				ce++;
				total=total+colour[j];
				
			}
		}
		if(f==c)
		{
			
			total=total+red[i];
			
		}
	}
	for(int i=0;i<y;i++)
	{
		f=0;
		for(int j=ce;j<c;j++)
		{
			if(green[i]>=colour[j])
				f++;
			else
			{
				ce++;
				total=total+colour[j];
				
			}
		}
		if(f==c)
		{
			total=total+green[i];
			
		}
	}
	System.out.println(total);
   }
}
      