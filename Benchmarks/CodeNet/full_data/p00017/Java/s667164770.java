import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())	
		{
			char ch[]=in.nextLine().toCharArray();
			char a=1;
			int ju=0;
			for(int i=0;i<26;i++)
			{
				for(int j=0;j<ch.length;j++)
				{
					if(ch[j]+a>122)
						ch[j]='a';
					else if(ch[j]==' ')
						continue;
					else if(ch[j]=='.')
						continue;
					else
						ch[j]=(char) (ch[j]+a);
				}
				for(int j=0;j<ch.length;j++)
				{
					if(j+2<ch.length&&ch[j]=='t'&&ch[j+1]=='h'&&ch[j+2]=='e')
					{
						ju=1;
						break;
					}
					else if(j+3<ch.length&&ch[j]=='t'&&ch[j+1]=='h'&&ch[j+2]=='i'&&ch[j+3]=='s')
					{
						ju=1;
						break;
					}
					else if(j+3<ch.length&&ch[j]=='t'&&ch[j+1]=='h'&&ch[j+2]=='a'&&ch[j+3]=='t')
					{
						ju=1;
						break;
					}
				}
				if(ju==1)
					break;
			}
			System.out.println(ch);
		}
	}
}