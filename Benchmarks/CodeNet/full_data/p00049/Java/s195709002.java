import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int[] count = new int[4];
		while(stdIn.hasNext())
		{
			String[] str = stdIn.next().split(",");
			String blood = str[1];
			if(blood.equals("A"))
			{
				++count[0];
			}
			else if(blood.equals("B"))
			{
				++count[1];
			}
			else if(blood.equals("AB"))
			{
				++count[2];
			}
			else
			{
				++count[3];
			}
		}
		for(int i = 0; i < 4; ++i)
		{
			System.out.println(count[i]);
		}
	}
}