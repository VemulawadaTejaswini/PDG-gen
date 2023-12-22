import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		long ans = 1;
		for(int i = 1; i <= n; ++i)
		{
			ans *= i;
		}
		System.out.println(ans);
	}
}