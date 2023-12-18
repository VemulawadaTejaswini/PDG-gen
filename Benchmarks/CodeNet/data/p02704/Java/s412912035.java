import java.util.*;
 import java.math.BigInteger;
public class Main
{
	public static  void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		// String h[]=sc.nextLine().split(" ");
		int n=Integer.parseInt(sc.nextLine());
		StringBuilder sb=new StringBuilder();
		String a[]=sc.nextLine().split(" ");
		String b[]=sc.nextLine().split(" ");
		String c[]=sc.nextLine().split(" ");
		String d[]=sc.nextLine().split(" ");
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(Integer.parseInt(a[i])==Integer.parseInt(b[i]) && Integer.parseInt(c[i])!=Integer.parseInt(d[i])){flag=1;break;}
			else if(Integer.parseInt(a[i])==Integer.parseInt(b[i]))
			{
				
				 
					// sb.append(Integer.parseInt())
					for(int j=0;j<n-1;j++)
					{
						sb.append(c[i]+" ");
					}
				sb.append(c[i]+"\n");
			}
			else 
			{
				long g=Long.parseLong(a[i]);
				long h=Long.parseLong(b[i]);
				// long k=Long.parseLong(c[i]);
				// long jj=Long.parseLong(d[i]);
				String or=(g==1)?c[i]:d[i];
				String and=(g==0)?c[i]:d[i];
				BigInteger xx=new BigInteger(or);
				BigInteger yy=new BigInteger(and);
				if(!xx.and(yy).equals(yy)){flag=1;break;}
				else
				{
					for(int j=0;j<n-1;j++){sb.append(or+" ");}
					sb.append(and+"\n");
				}
			}
			if(flag==1){break;}
		}
		if(flag==1){System.out.println(-1);}
		else
		{
			System.out.println(sb.toString());
		}
		}

	}



	
