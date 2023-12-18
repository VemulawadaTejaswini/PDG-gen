import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	static long[] mask = new long[40];

	static long powmask(long ma)
	{
		for(int i = 0; i < 40; i++)
			if(mask[i] == ma)return i;
		
		return -1;
	}
	
	public static void main(String[] args) 
	{
		long curm = 1;
		for(int i = 0; i < 40; i++)
		{
			mask[i] = curm;
			curm *= 2;
		}
		//30
		//max 39 digits for sum
//		System.out.println(Long.toString(1000000000l,2));
//		System.out.println(Long.toString(1000000000000l,2));
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		long[] a = new long[1000];
		long[] suml = new long[n];
		long cursum = 0;
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextLong();
			cursum +=a[i];
			suml[i] = cursum;
		}
		
		int seqs = (n*(n+1))/2;
		int curseqs = 0;
		
		long[] seq = new long[seqs];
		
		
		long an = 0;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = i; j < n; j++)
			{
				long curseq = suml[j];
				if(i>0)curseq-=suml[i-1];
				seq[curseqs]=curseq;
//				System.out.println("b " + seq[curseqs]);
				curseqs++;
			}
		}
		
		long reqs = 0;
		int maxmask = 40;
		while(true)
		{
			long[] occ = new long[40];
			
			for(int i = 0; i < seqs; i++)
			{
				for(int d = 0; d < maxmask; d++)
					if(((mask[d] & seq[i]) > 0 && (reqs == 0 || (reqs & seq[i]) == reqs)))
					{
//						System.out.println("GULP");
						occ[d]++;
					}
					else 
					{
//						System.out.println(Long.toString(mask[d],2) + " and " + Long.toString(seq[i],2));
					}
			}
//			System.out.println("occ: " + Arrays.toString(occ));
			
			int bigd = -1;
			for(int i = 0; i < 40; i++)
			{
				if(occ[i] >= k)
				{
					bigd = i;
				}
			}
			
			if(bigd > -1)
			{
				an += mask[bigd];
				reqs += mask[bigd];
				maxmask = bigd;
			}
			else
			{
				System.out.println(an);
				return;
			}
		}
	}

}
