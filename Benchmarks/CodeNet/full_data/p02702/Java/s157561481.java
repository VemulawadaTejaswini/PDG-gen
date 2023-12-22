import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		
		
		int ans = 0;
		for(int i=0; i< s.length()-4; i++)
		{
			int length = i+5;
			String str = s.substring(i, length);
			
			int val = Integer.parseInt(str);
			
			if(val%2019 == 0)
			{
				ans++;
			}
		}
		
		System.out.println(ans);
		sc.close();

	}

}
