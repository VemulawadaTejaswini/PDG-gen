import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Long> neg = new ArrayList<Long>();
		ArrayList<Long> pos = new ArrayList<Long>();
		int zeroes = 0;
		long sum = 0;
		for(int i = 0; i < n; i++)
		{
			long a = sc.nextLong();
			if(a>0)sum+=a;else sum-=a;
			if(a<0)neg.add(a);
			else if(a>0)pos.add(a);
			else zeroes++;
		}
		neg.sort(null);
		pos.sort(null);
		
		ArrayList<Long> paired = new ArrayList<>();
		
		if(zeroes == 0 && neg.size() == 0)
		{//all pos
			long swa = pos.get(0);
			System.out.println((sum - swa - swa));
			for(int i = 1; i < pos.size()-1; i++)
			{
				long a = pos.get(i);
				System.out.println(swa + " " + a);
				swa = swa - a;
			}
			//last
			System.out.println(pos.get(pos.size()-1) + " " + swa);
			swa = pos.get(pos.size()-1) - swa;
//			System.out.println("Turns " + swa);
		}
		else if(zeroes == 0 && pos.size() == 0)
		{ //all neg
			long swa = neg.get(neg.size()-1);
			System.out.println((sum + swa + swa));
			for(int i = neg.size()-2; i >=1; i--)
			{
				long a = neg.get(i);
				System.out.println(swa + " " + a);
				swa = swa - a;
			}
			//last
			System.out.println(neg.get(0) + " " + swa);
			swa = neg.get(0) - swa;
		}
		
		//assume not all neg, not all pos
		else if(neg.size() < pos.size())
		{
			System.out.println(sum);
			if(neg.size() == 0)
			{ //pos and 0
				if(pos.size() == 1)
				{
					for(int i = 0; i<zeroes;i++)
					System.out.println(pos.get(0) + " 0");
					return;
				}
				else
				{
					System.out.println("0 " + pos.get(0));
					zeroes--;
					neg.add(-pos.get(0));
					neg.sort(null);
					pos.remove(0);
				}
			}
			
			long swallow = neg.get(neg.size()-1);
			for(int ind = 0; ind < neg.size()-1; ind++)
			{ //pairings: turn to pos
				long a = neg.get(ind);
				long b = pos.get(ind);
				System.out.println(b + " " + a);
				paired.add((b-a));
			}
			int toswallow = paired.size() + (pos.size() - (neg.size()-1));
//			System.out.println("To swallow: " + toswallow);
			int swallowed = 0;
			//swallow paired
			for(Long l : paired)
			{
				if(swallowed == toswallow-1)
				{
//					System.out.println("Last swallow!");
					System.out.println(l + " " + swallow);
					swallow = l - swallow;
					swallowed++;
				}
				else
				{
					System.out.println(swallow + " " + l);
					swallow = swallow - l;
					swallowed++;
				}
			}
//			System.out.println("Swallow rest!");
			for(int ind = neg.size()-1; ind < pos.size(); ind++)
			{ //swallow rest
				long l = pos.get(ind);
				if(swallowed == toswallow-1)
				{
//					System.out.println("Last swallow!");
					System.out.println(l + " " + swallow);
					swallow = l - swallow;
					swallowed++;
				}
				else
				{
					System.out.println(swallow + " " + l);
					swallow = swallow - l;
					swallowed++;
				}
				
			}
			for(int i = 0; i < zeroes; i++)
			{
				System.out.println(swallow + " " + 0);
			}
//			System.out.println("END: " + swallow);
		}
		else if(pos.size() <= neg.size())
		{
			System.out.println(sum);
			if(pos.size() == 0)
			{ //neg and 0
				if(neg.size() == 1 && zeroes > 0)
				{
					System.out.println("0 " + neg.get(0));
					for(int i = 0; i<zeroes-1;i++)
						System.out.println((-neg.get(0)) + " 0");
					return;
				}
				else
				{				
					System.out.println("0 " + neg.get(0));
					zeroes--;
					pos.add(-neg.get(0));
					pos.sort(null);
					neg.remove(0);
				}
			}
			
			long swallow = pos.get(pos.size()-1);
			for(int ind = 0; ind < pos.size()-1; ind++)
			{ //pairings: turn to neg
				long a = neg.get(ind);
				long b = pos.get(ind);
				System.out.println(a + " " + b);
				paired.add((a-b));
			}
//			System.out.println("To swallow: ");
			//swallow paired
			for(Long l : paired)
			{
				System.out.println(swallow + " " + l);
				swallow = swallow - l;
			}
//			System.out.println("Swallow rest!");
			for(int ind = pos.size()-1; ind < neg.size(); ind++)
			{ //swallow rest
				long l = neg.get(ind);

				System.out.println(swallow + " " + l);
				swallow = swallow - l;
				
			}
			for(int i = 0; i < zeroes; i++)
			{
				System.out.println(swallow + " " + 0);
			}
//			System.out.println("END: " + swallow);			
			
			
		}
		
	}

}
