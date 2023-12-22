import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			int f=in.nextInt();
			int ans=0;
			String s=in.next();
			String r="IOI";
			for(int i=1;i<n;i++)
				r+="OI";
			if(r.length()-s.length()<0)
			{
				System.out.println(0);
				continue;
			}
			for(int i=0;i<s.length()-r.length();i++)
			{
				if(r.equals(s.substring(i, i+r.length())))
					ans++;
			}
			System.out.println(ans);
		}
	}
}