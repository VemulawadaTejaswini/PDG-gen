import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	static int count = 0;
	static long best = 0;
	static void make(int x, int[] cur)
	{
		if(x < n)
		{
			int lastel = 1;
			if(x > 0)lastel = cur[x-1];
			
			for(int k = lastel; k <= m; k++)
			{
				int[] ncur = cur.clone();
				ncur[x] = k;
				make(x+1, ncur);
			}
		}
		else
		{
			long cor = 0;
			
			for(int i = 0; i < q; i++)
			{
				if(cur[b[i]] - cur[a[i]] == c[i])
					cor+=d[i];
			}
			best = Math.max(best, cor);
			count++;
//			System.out.println(Arrays.toString(cur));
		}
	}
	
	static int n, m, q;
	static int[] a, b, c;
	static long[] d;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		q = sc.nextInt();
		
		a = new int[q];
		b = new int[q];
		c = new int[q];
		d = new long[q];
		for(int i = 0; i < q; i++)
		{
			a[i] = sc.nextInt()-1;
			b[i] = sc.nextInt()-1;
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		
		make(0,new int[10]);
		
		System.out.println(best);
	}

}
