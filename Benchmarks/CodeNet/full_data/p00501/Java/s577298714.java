import java.util.Scanner;

public class Main
{
	public static boolean Check(String s, String target)
	{
		for(int pos=0; pos<s.length(); pos++)
		{
			int dist=1;
			int checkSize=target.length();
			
			while(pos+checkSize-1 < s.length())
			{
				boolean isFound=true;
				for(int i=0; i<target.length(); i++)
				{
					if(s.charAt(pos+i*dist) != target.charAt(i))
					{
						isFound = false;
						break;
					}
				}
				if(isFound)return true;
				dist++;
				checkSize+=target.length()-1;
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		int ans=0;
		
		sc.nextLine();
		String  target  =sc.nextLine();
		String[]s       =new String[N];
		for(int i=0; i<N; i++)
			s[i]=sc.nextLine();
		
		for(int i=0; i<N; i++)
			if(Check(s[i], target))ans++;
		
		System.out.println(ans);
	}
}