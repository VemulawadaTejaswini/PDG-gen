import java.util.Scanner;

public class Main 
{
	static int n;
	static int[] tar;
	static int[] a;
	static int an = 999999999;
	
	static int go(int cs)
	{
		int cur = 0;
		int[] init = new int[4];
		for(int i = 0; i < n; i++)
		{ //find out where each bamboo belongs
			int d0 = (mask[i*2+1] & cs)>0?1:0;
			int d1 = (mask[i*2] & cs)>0?1:0;
			int bel = d0*2+d1;
			if(init[bel] > 0 && bel < 3)cur += 10; //pay to merge
			init[bel] += a[i];
		}
		
		for(int i = 0; i < 3; i++)
		{ //make this bamboo
			if(init[i] == 0)return 99999999;
			int mk = tar[i] - init[i];
			if(mk < 0)mk*=-1;
			cur += mk;
		}
		return cur;
		
	}

	static int[] mask = new int[16];
	
	public static void main(String[] args) 
	{
		int curm = 1;
		for(int i = 0; i < 16; i++)
		{
			mask[i] = curm;
			curm*=2;
		}
		
		tar = new int[3];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for(int i = 0; i < 3; i++)
			tar[i] = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int cases = 1;
		for(int i = 0; i < n; i++)
		{
			cases *= 4;
		}
		
		for(int i = 0; i < cases; i++)
		{
			an = Math.min(an, go(i));
		}
		System.out.println(an);
	}

}
