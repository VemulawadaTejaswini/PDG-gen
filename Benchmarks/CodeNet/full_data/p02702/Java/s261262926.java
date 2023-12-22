import java.util.Scanner;

public class Main
{ //202 is the modular multiplicative inverse of 2019.
	static int mod(int x)
	{
		int an = x%2019;
		while(an<0)an+=2019;
		return an;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int n = s.length();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			a[i] = s.charAt(i) - '0';
		}
		
		long[] avail = new long[2019];
		
		int backtransmul = 1;
		int backtransadd = 0;
		long score = 0;
		int curval = 0;
		for(int i = 0; i < n; i++)
		{
			curval = mod(curval*10 + a[i]);
			int cura = mod((0 * backtransmul) - backtransadd);
			avail[cura]++;
			
			int curb = mod((0 * backtransmul) - backtransadd);
			
			backtransmul = mod(backtransmul*202);
			backtransadd = mod(backtransadd + backtransmul*a[i]);
			
			int curc = mod((0 * backtransmul) - backtransadd);
			score += avail[curc];
		}
		
		System.out.println(score);
	}

}