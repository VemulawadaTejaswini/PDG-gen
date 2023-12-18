import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	static int dif(int a, int b)
	{
		int ma = Math.max(a, b);
		int mi = Math.min(a, b);
		return Math.min(b-a, 24 - (b-a));
	}
	static int uncertains;
	static int[] uncertain;
	static boolean[] certain;
	
	static int testcase(int cs)
	{
//		System.out.println("Start case " + Integer.toString(cs,2));
		boolean[] occ = new boolean[24];
		occ[0] = true;
		
		for(int i = 0; i < 24; i++)
			if(certain[i])occ[i]=true;
		
		for(int i = 0; i < uncertains; i++)
		{
			int pos = 0;
			if((mask[i] & cs) > 0)
			{ //inverse
				pos = 24-uncertain[i];
//				System.out.println("Inverse " + i + " into " + pos);
			}
			else
			{ //no-inverse
				pos = uncertain[i];
			}
			
			if(occ[pos])
			{
				return 0;
			}
			else
			{
				occ[pos] = true;
			}
		}
		
		//measure min dis
		int lead = 0;
		int min = 99999999;
		for(int i = 1; i < 24; i++)
		{
			if(occ[i])
			{
//				System.out.println("Occ " + i + ", lead " + lead);
				min = Math.min(min, i-lead);
				
				lead = i;
			}
		}
		if(lead!=0)
		{
			min = Math.min(min, 24-lead);
		}
//		System.out.println("case " + Integer.toString(cs,2) + ": " + min + "\n");
		
		return min;
	}
	
	static int[] mask = new int[12];
	
	public static void main(String[] args) 
	{
		int ms = 1;
		for(int k = 0; k < 12; k++)
		{
			mask[k] = ms;
			ms*=2;
		}
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean[] occ = new boolean[24];
		occ[0] = true;
		
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		int[] pos = new int[n];
		int close = 999;
		
		int[] grouphas = new int[12];
		grouphas[0]=1;
		
		certain = new boolean[24];
		
		for(int i = 0; i < n; i++)
		{
			int c = sc.nextInt();
			if(c==0)
			{
				System.out.println(0);
				return;
			}
			a[i] = c;
			b[i] = 24-c;
			close = Math.min(close, c);
			if(c==12)c-=12;
			grouphas[c]++;
			if(grouphas[c]>=3)
			{
				System.out.println(0);
				return;
			}
			else if(grouphas[c]==2)
			{
				//both possibilities must be occupied
				certain[a[i]]=true;
				certain[b[i]]=true;
			}
		}
		if(n>=24 || close <= 0)
		{
			System.out.println(0);
			return;
		}
		
		int unccount = 0;
		for(int i = 0; i < 12; i++)
			if(grouphas[i] == 1)
				unccount++;
		
		uncertain = new int[unccount];
		uncertains = 0;
		
		for(int i = 1; i < 12; i++)
		{ //tak is def. 0
			if(grouphas[i] == 1)
			{
				uncertain[uncertains] = i;
				uncertains++;
			}
		}
		
		int cases = 1;
		for(int i = 0; i < uncertains; i++)
			cases *= 2;
		
		int maxs = 0;
//		System.out.println(Arrays.toString(uncertain));
//		System.out.println("Cases " + cases);
		for(int c = 0; c < cases; c++)
		{
			maxs = Math.max(maxs, testcase(c));
		}
		System.out.println(maxs);
	}

}
