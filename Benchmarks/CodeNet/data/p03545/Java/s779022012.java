import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char a[]=s.toCharArray();
		int b[]=new int[5];
		for(int i=0;i<4;i++)
			b[i]=a[i]-'0';
		boolean flag=true;
		for(int i=0;i<=1 && flag;i++)
			for(int j=0;j<=1 && flag;j++)
				for(int k=0;k<=1 && flag;k++)
				{
					int res=b[0];
					if(i==0)res+=b[1];
					if(i==1)res-=b[1];
					if(j==0)res+=b[2];
					if(j==1)res-=b[2];
					if(k==0)res+=b[3];
					if(k==1)res-=b[3];
					if(res==7)
					{
						System.out.print(b[0]);
						if(i==0)System.out.print("+");
						else System.out.print("-");
						System.out.print(b[1]);
						if(j==0)System.out.print("+");
						else System.out.print("-");
						System.out.print(b[2]);
						if(k==0)System.out.print("+");
						else System.out.print("-");
						System.out.print(b[3]);
						flag=false;
					}
				}
		System.out.print("=7");
		System.out.println();
	}
}