import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			char ch[]=in.next().toCharArray();
			int n=in.nextInt();
			int ans=0;
			while(n-->0)
			{
				char ri[]=in.next().toCharArray();
				char ri2[]= new char[ri.length*2];
				for(int i=0;i<ri.length;i++)
					ri2[i]=ri[i];
				for(int i=0;i<ri.length;i++)
					ri2[i+ri.length]=ri[i];
				boolean ju=false;
				for(int i=0;i<=ri.length;i++)
				{
					for(int j=0;j<ch.length;j++)
					{
						if(ri2[i+j]==ch[j])
							ju=true;
						else
						{
							ju=false;
							break;
						}
					}
					if(ju)
						break;
				}
				if(ju)
					ans++;
			}
			System.out.println(ans);
		}
	}

}