import java.util.*;

class Main 
{
  	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();

		LinkedList<Long> W = new LinkedList<Long>();
		LinkedList<Long> V = new LinkedList<Long>();
		
		Map<Long, Long> cnt = new HashMap<Long, Long>(); 
		long sum_w  = 0, sum_v = 0;

		for(int i = 0; i < n; i++)
		{
			W.add(sc.nextLong());
			V.add(sc.nextLong());
			sum_w += W.get(i);
			sum_v += V.get(i);
		}

		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(i == j) continue;
				if(cnt.containsKey(W.get(i) + W.get(j)))
					cnt.put(W.get(i) + W.get(j), Math.max(cnt.get(W.get(i) + W.get(j)), V.get(i) + V.get(j)));
				else
					cnt.put(W.get(i) + W.get(j), V.get(i) + V.get(j));
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