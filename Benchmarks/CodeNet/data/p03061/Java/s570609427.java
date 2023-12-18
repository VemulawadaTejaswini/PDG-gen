import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args)
	{
		new Main().run();
	}
	
	public void run()
	{
		Scanner file = new Scanner(System.in);
		int N = file.nextInt();
		int[] ints = new int[N];
		for(int i = 0;i<N;i++)
			ints[i] = file.nextInt();
		int[] before = new int[N];
		int[] after = new int[N];
		before[0] = ints[0];
		after[after.length - 1] = ints[ints.length - 1];
		for(int i = 1;i<ints.length;i++)
		{
			before[i] = gcd(before[i-1],ints[i]);
			after[after.length-i-1] = gcd(ints[after.length-i],ints[ints.length-i-1]);
		}
		
		int best = 0;
		
		for(int i = 1;i<ints.length-1;i++)
			best = Math.max(best,gcd(before[i-1],after[i+1]));
		best = Math.max(best, after[1]);
		best = Math.max(best,before[ints.length-2]);
		System.out.println(best);
	}
	
	int gcd(int a, int b)
	{
		return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
	}
	
}
