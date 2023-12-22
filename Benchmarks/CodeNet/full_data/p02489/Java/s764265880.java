import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int x = sc.nextInt();
			if(x == 0)
			{
				break;
			}
			++count;
			System.out.println("Case " + count + ": " + x);
		}
	}
}