import java.util.*;

class Main 
{
  	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();

		long W[] = new long[n],
			 V[] = new long[n];
		
		Map<Long, Long> cnt = new HashMap<Long, Long>(); 
		long sum_w  = 0, sum_v = 0;

		for(int i = 0; i < n; i++)
		{
			W[i] = sc.nextInt();
			V[i] = sc.nextInt();
			sum_w += W[i];
			sum_v += V[i];
		}

		for(int i = 0; i < n; i++)
		{
			if(cnt.containsKey(W[i]))
				cnt.put(W[i] + W[i], cnt.get(W[i]) + V[i]);
			else
				cnt.put(W[i], V[i]);
		}

		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(i == j) continue;
				if(cnt.containsKey(W[i] + W[j]))
					cnt.put(W[i] + W[j], Math.max(cnt.get(W[i] + W[j]), V[i] + V[j]));
				else
					cnt.put(W[i] + W[j], V[i] + V[j]);
			}
		}

		if(cnt.containsKey((long)w))
			System.out.println(cnt.get((long)w));
		else
		{
			if(sum_w < w)
				System.out.println(sum_v);
			else
				System.out.println(0);
		}
  	}
}