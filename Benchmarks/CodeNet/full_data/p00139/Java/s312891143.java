import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		while(n-->0)
		{
			String str = sc.nextLine();
			char ch[] = str.toCharArray();
			int counta =0;
			int countb =0;
			try{
				if(ch[0]=='>'&&ch[1]=='\'' &&ch[ch.length-1]=='~')
				{
					int co=2;
					while(ch[co]!='#')
					{
						if(ch[co]=='=')
							counta++;
						co++;
					}
					while(ch[co]!='~')
					{
						if(ch[co]=='=')
							countb++;
						co++;
					}
					if(counta==countb)
					{
						System.out.println("A");
						continue;
					}
					else 
					{
						System.out.println("NA");
						continue;
					}
				}
				else
					if(ch[0]=='>'&&ch[1]=='^' &&ch[str.length()-1]=='~'&&ch[str.length()-2]=='~')
					{
						boolean flag=false;
						int co=2;
						while(ch[co] != '~')
						{
							if(ch[co]=='Q'&&ch[co+1]=='=')
								flag = true;
							else 
							{
								flag = false;
								break;
							}
							co+=2;
						}
						if(flag == true)
							System.out.println("B");
					}
				System.out.println("NA");
			}
			catch(Exception e)
			{}
		}
	}
}