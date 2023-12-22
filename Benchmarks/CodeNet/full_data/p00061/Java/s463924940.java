import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int id[]=new int[10000];
		int sc[]=new int[10000];
		int i=0;
		int j=0;
		
		while(true)
		{
			String str[]=in.next().split(",");
			if(str[0].equals("0")&&str[1].equals("0"))
				break;
			id[i++]=Integer.valueOf(str[0]);
			sc[j++]=Integer.valueOf(str[1]);
		}
		while(in.hasNext())
		{
			int n=in.nextInt();
			int se=0;
			for(int m=0;m<i;m++)
			{
				if(n==id[m])
				{
					se=m;
					break;
				}
			}
			boolean b[] =new boolean[31];
			Arrays.fill(b, true);
			int ans=1;
			for(int l=0;l<i;l++)
			{
				if(sc[se]<sc[l]&&b[sc[l]])
				{
					ans++;
					b[sc[l]]=false;
				}
			}
			System.out.println(ans);
		}
	}
}