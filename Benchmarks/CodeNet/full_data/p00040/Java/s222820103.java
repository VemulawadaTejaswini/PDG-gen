import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		in.nextLine();
		while(N-->0)
		{
			char ch[]=in.nextLine().toCharArray();
			char re[]=new char[ch.length];
			boolean judge=false;
			String res="";
			for(int a=0;a<26;a++)
			{
				for(int b=0;b<26;b++)
				{
					for(int i=0;i<ch.length;i++)
					{
						if(ch[i]==' ')
						{
							re[i]=' ';
							continue;
						}
						int m=(a*((int)ch[i]-97)+b)%26;
						re[i]=(char)(m+97);
					}
					res="";
					for(int i=0;i<re.length;i++)
						res+=re[i];
					if(res.indexOf("this")!=-1||res.indexOf("that")!=-1)
						judge=true;
					if(judge)
						break;
				}
				if(judge)
					break;
			}
			for(int i=0;i<re.length-1;i++)
				System.out.print(re[i]);
			System.out.println(re[re.length-1]);
		}
	}
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}