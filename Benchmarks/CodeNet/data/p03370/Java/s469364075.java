

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String []args)
	{
		int n,x,y;
		int []moto=new int [1005];
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			n=cin.nextInt();
			x=cin.nextInt();
			long  sum=0;
			int min=0x6FFFF;
			for(int i=0;i<n;i++)
			{
				moto[i]=cin.nextInt();
				sum+=moto[i];
				if(min>moto[i])
					min=moto[i];
			}
			int ans=n;
			x-=sum;
			ans+=x/min;
			System.out.println(ans);
			
		}
	}
}