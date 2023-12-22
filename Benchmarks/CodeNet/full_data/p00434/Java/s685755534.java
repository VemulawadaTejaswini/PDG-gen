import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		boolean[] flag = new boolean[31];
		for(int i = 0; i < flag.length; ++i)
		{
			flag[i] = false;
		}
		for(int i = 0; i < 28; ++i)
		{
			int a = stdIn.nextInt();
			flag[a] = true;
		}
		for(int i = 1; i < flag.length; ++i)
		{
			if(!flag[i])
			{
				System.out.println(i);
			}
		}
	}
}