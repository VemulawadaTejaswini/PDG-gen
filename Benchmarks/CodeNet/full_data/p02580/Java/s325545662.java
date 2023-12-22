import java.io.*;
import java.util.*;
public class Main
{ 
	public static void main(String[]args)throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		String s;
		int a,b,c,d,e,h,i,j,k,l;
		long f,g;
		s=in.readLine();
		a=Integer.parseInt(s.substring(0,s.indexOf(' ')));
		b=Integer.parseInt(s.substring(s.indexOf(' ')+1,s.lastIndexOf(' ')));
		c=Integer.parseInt(s.substring(s.lastIndexOf(' ')+1));
		int[][]z=new int[a][b];
		for(d=0;d<a;d++)
		{
			for(e=0;e<b;e++)z[d][e]=0;
		}
		for(;c>0;c--)
		{
			s=in.readLine();
			d=Integer.parseInt(s.substring(0,s.indexOf(' ')));
			e=Integer.parseInt(s.substring(s.lastIndexOf(' ')+1));
			z[d-1][e-1]=1;
		}
		long[]y=new long[a];
		long[]x=new long[b];
		for(d=0;d<a;d++)
		{
			for(e=0,f=0;e<b;e++)
			{
				if(z[d][e]==1)f++;
			}
			y[d]=f;
		}
		for(d=0;d<b;d++)
		{
			for(e=0,f=0;e<a;e++)
			{
				if(z[e][d]==1)f++;
			}
			x[d]=f;
		}
		for(d=0,f=0;d<a;d++)
		{
			for(e=0;e<b;e++)
			{
				g=y[d]+x[e];
				if(z[d][e]==1)g--;
				if(g>f)f=g;
			}
		}
		System.out.println(f);
	}
} 