
import java.util.*;
public class Main {
	public static int LongestCommonSequence(String string1, String string2)
	{
		int max = 0;
		int len1 = string1.length() , len2 = string2.length();
		//table to find longest common sequence
		int[][] table = new int[len1 + 1][len2 + 1];
		//filling the table for max values
		for(int i = 1; i <= len1  ; i++)
		{
			for(int j = 1 ; j <= len2 ; j++)
			{
				if(string1.charAt(i-1) != string2.charAt(j-1))
				{
					table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
				}
				if(string1.charAt(i-1) == (string2.charAt(j-1)))
				{
					table[i][j] = 1 + table[i-1][j-1];
				}
			}
		}
		max = table[len1][len2];
		return max;
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int pairs = in.nextInt();
		for(int i = 0; i < pairs ; i ++)
		{
			String s1 = in.next();
			String s2 = in.next();
			int answer = LongestCommonSequence(s1,s2);
			System.out.println(answer);
		}
		
	}
}

