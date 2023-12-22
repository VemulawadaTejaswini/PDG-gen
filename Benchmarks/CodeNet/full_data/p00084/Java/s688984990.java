import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			char ch[]=in.nextLine().toCharArray();
			String str="";
			int j=0;
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==' '||ch[i]==','||ch[i]=='.')
				{

					if(str.length()>=3&&str.length()<=6)
					{
						if(j==1)
							System.out.print(" ");
						System.out.print(str);
						j=1;
					}
					str="";
				}
				else
					str+=ch[i];
			}
			System.out.println();
		}
	}
}