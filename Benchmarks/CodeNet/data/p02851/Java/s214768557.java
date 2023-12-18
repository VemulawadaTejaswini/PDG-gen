import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k =sc.nextInt();
		
		int[] nums = new int[n];
		for (int i = 0 ; i < n ; i++) {nums[i]=sc.nextInt();}
		
		int ans = 0;
		for (int i = 0 ; i < k; i++)
		{
			//remainders
			
			for (int b = 0 ; b < (n-i) ; b++)
			{
				//System.out.println(b);System.out.println();
				int s = 0;
				for (int  ne = b ; ne <= (b+i) ; ne ++)
				{
					//System.out.println(i+"\t"+b+"\t"+ne);
					s+=nums[ne];
				}
				//System.out.println(s);
				if (s%k == (1+i))
				{
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
