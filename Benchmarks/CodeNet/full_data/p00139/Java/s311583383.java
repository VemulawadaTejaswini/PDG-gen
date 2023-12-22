import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0)
		{
			char ch[] = in.next().toCharArray();
			int counta =0;
			int countb =0;
			boolean flag=false;
				if(ch[0]=='>'&&ch[1]=='\'' &&ch[ch.length-1]=='~'&&ch[ch.length-2]=='=')
				{
					int co=2;
					while(ch[co]!='#')
					{
						if(ch[co]=='=')
							counta++;
						co++;
						if(co==ch.length-1)
							break;
					}
					while(ch[co]!='~')
					{
						if(ch[co]=='=')
							countb++;
						co++;
					}
					if(counta==countb&&counta>0)
						System.out.println("A");
					else 
						System.out.println("NA");
					continue;
				}
				else
					if(ch[0]=='>'&&ch[1]=='^' &&ch[ch.length-1]=='~'&&ch[ch.length-2]=='~')
					{
						
						for(int co=2;co<ch.length-2;co+=2)
						{
							if(ch[co]=='Q'&&ch[co+1]=='=')
								flag = true;
							else 
							{
								flag = false;
								break;
							}
						}
					}
				System.out.println(flag==true ? "B":"NA");
			}
		}
	}