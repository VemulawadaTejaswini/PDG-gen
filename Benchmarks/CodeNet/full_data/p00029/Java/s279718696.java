import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String atg[])
	{		
		Scanner sc = new Scanner(System.in);
		String s[] = new String[1001];
		int index = 0;
		while(sc.hasNext())
		{
			String str = sc.next();
			s[index] = str;
			index++;
		}

		int r[] = new int [index];
		boolean flag[] = new boolean[1001];
		Arrays.fill(flag, true);

		for(int i=0; i<index; i++)
			for(int j=i+1; j<index; j++)
			{
				if(s[i].equals(s[j])&&flag[j]==true)
				{
					r[i]++;
					flag[j]=false;
				}
			}

		int max=0;
		for(int i=0; i<index; i++)
		{

			if(max < r[i])
				max = i;
		}

		System.out.print(s[max]+" ");
		for(int i=0; i<index; i++)
			if(max<s[i].length())
			{
				max =i;
			}
		System.out.println(s[max]);
	}

}