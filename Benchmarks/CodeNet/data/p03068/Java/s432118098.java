import java.util.*;
class Trial
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n, k;
		String s;
		n = input.nextInt();
		s = input.next();
		k = input.nextInt();
		StringBuilder answer = new StringBuilder();
		for(int i = 0; i < n; i++)
		{
			if(s.charAt(i) != s.charAt(k-1))
			{
				answer.append("*");
			}
			else
			{
				answer.append(s.charAt(i));
			}
		}
		System.out.println(answer);
	}
}