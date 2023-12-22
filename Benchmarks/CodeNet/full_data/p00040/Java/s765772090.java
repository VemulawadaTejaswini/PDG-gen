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
			for(int a=0;a<100;a++)
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
					for(int i=0;i<re.length-1;i++)
						if(i+3<re.length)
							if((re[i]=='t'&&re[i+1]=='h'&&re[i+2]=='a'&&re[i+3]=='t')
									||(re[i]=='t'&&re[i+1]=='h'&&re[i+2]=='i'&&re[i+3]=='s'))
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