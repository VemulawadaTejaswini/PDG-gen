import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String in = new String();
		for(;scanner.hasNext();)
		{
			in += scanner.nextLine();
		}
		
		int[] cnt = new int[26];
		for(int i=0; i<cnt.length; i++)
		{
			cnt[0] = 0;
		}
		
		for(int i=0; i<in.length(); i++)
		{
			char c = in.charAt(i);
			for(int j=0; j<cnt.length; j++)
			{
				if(c=='a'+j || c=='A'+j)
				{
					cnt[j]++;
					break;
				}
			}
		}
		
		for(int i=0; i<cnt.length; i++)
		{
			System.out.println((char)('a'+i) + " : " + cnt[i]);
		}
	}
}