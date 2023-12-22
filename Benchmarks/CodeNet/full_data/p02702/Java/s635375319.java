import java.math.BigInteger;
import java.util.Scanner;

public class Main 
{
	static int mod(int x)
	{
		int an = x%2019;
		while(an<0)an+=2019;
		return an;
	}

	public static void main(String[] args) 
	{
		BigInteger bi = new BigInteger("10");
		int x = 141;
//		System.out.println("test: " + mod(10*202));
		
		int inverse = 202;
		int goback = 1;
		
//		System.out.println(bi);
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int n = s.length();
		int[] a = new int[n];
		
		int target = 0;
		
		for(int i = 0; i < n; i++)
		{
			a[i] = s.charAt(i) - '0';
		}
		
		long[] avail = new long[2019];
		int suffix = 0;
		int digitval = 1;
		
		int cur = 0;
		
		int backtransmul = 1;
		int backtransadd = 0;
		long score = 0;
//		int digsz = 1;
		int curval = 0;
		for(int i = 0; i < n; i++)
		{
			curval = mod(curval*10 + a[i]);
			
//			System.out.println("curval " + curval);
//			int cura = mod((a[i] * backtransmul) - backtransadd);
			int cura = mod((0 * backtransmul) - backtransadd);
			avail[cura]++;
//			System.out.println("cura " + cura);
			
			int curb = mod((0 * backtransmul) - backtransadd);
//			System.out.println("curb " + curb + " " + avail[curb]);
			
//			if(i>0)
			{
				backtransmul = mod(backtransmul*202);
//				backtransadd = mod(backtransadd*202    + a[i] * 202);
				backtransadd = mod(backtransadd + backtransmul*a[i]);
			}
//			digsz = mod(digsz*202);
//			System.out.println("trans x" + backtransmul + " " + " - " + backtransadd);
			
			{
				int curc = mod((0 * backtransmul) - backtransadd);
//				System.out.println("curc " + curc + " " + avail[curc] + "\n");
				score += avail[curc];
			}
		}
		
		System.out.println(score);
	}

}
