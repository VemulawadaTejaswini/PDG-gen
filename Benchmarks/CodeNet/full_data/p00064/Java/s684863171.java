import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		int count =0;
		String tmp = "0";
		while(in.hasNext())
		{
			char ch[]=in.nextLine().toCharArray();
			for(int i=0; i<ch.length; i++)
			{
				while(ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9')
				{
					tmp+=ch[i];
					i++;
				}
				count+=Integer.valueOf(tmp);
				tmp="0";
			}
		}
		System.out.println(count);
	}
}