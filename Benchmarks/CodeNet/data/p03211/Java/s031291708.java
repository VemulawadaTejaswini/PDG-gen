import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int ans = 999;
		int n=a.length();
		
		for(int i=0;i<n-2;i++)
		{
			String num = a.substring(i,i+3);
			int temp = Integer.parseInt(num);
			ans = Math.min(ans,Math.abs(753-temp));
		}
		
		System.out.println(ans);
		
		
		
		

	}
}