import java.util.Scanner;

public class Main{
	public static int LCS(String i, String j) 
	{
		int subI = i.length();
		int subJ = j.length();
		
		int[][] set = new int[subI + 1][subJ + 1];
		
		for(int n = 0; n <= subI; n++)
		{
			set[n][0] = 0;
		}
		for(int m = 0; m <= subJ; m++)
		{
			set[0][m] = 0;
		}
		
		for(int n = 1; n <= subI; n++)
		{
			for(int m = 1; m <= subJ; m++)
			{
				if(j.charAt(m-1) == i.charAt(n-1))
				{
					set[n][m] = 1 + set[n - 1][m - 1];
					//System.out.println("hi");
				}else
				{
					set[n][m] = Math.max(set[n-1][m], set[n][m-1]);
				}
			}
		}
		
		int max = 0;
		for(int n = 0; n <= subI; n++)
		{
			if(set[n][subJ] > max);
			{
				max = set[n][subJ];
			}
			//System.out.println(set[n][subJ] + " set I");
		}
		
		for(int m = 0; m <= subJ; m++)
		{
			if(set[subI][m] > max)
			{
				max = set[subI][m];
			}
			//System.out.println(set[subI][m] + " set J");
		}
		
		return max;
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int repetitions = in.nextInt();
		for(int i = 0; i < repetitions; i++)
		{
			System.out.println(LCS(in.next(), in.next()));
		}
	}
}





