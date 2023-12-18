

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String k=in.next();
		int z=0;
		int flag=0;
		char[] a=new char[k.length()];
		char[] b=new char[k.length()];
		for(int i=0;i<k.length();i++)
		{
			a=k.toCharArray();
		}
		for(int i=0;i<k.length();i++)
		{
			if(a[i]=='C'||a[i]=='F')
			{
				b[z]=a[i];
				z++;
			}
		}
		for(int i=0;i<z;i++)
		{
			for(int j=i+1;j<=z-1;j++)
			{
				if(b[i]=='C'&&b[j]=='F')
					flag=1;
			}
		}
		if(flag==1)
			System.out.println("Yes");
		else
			System.out.println("No");

		
		in.close();
	}

}
