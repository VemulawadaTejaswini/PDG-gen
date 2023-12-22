import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	
	static int n, m;
	static int[] taro, hanako;
	
	static void start()
	{
		int ttotal = 0;
		for(int i = 0;i < n;i++) ttotal += taro[i];
		
		int htotal = 0;
		for(int i = 0;i < m;i++) htotal += hanako[i];
		
		for(int tc = 0;tc < n;tc++)
		{
			for(int hc = 0;hc < m;hc++)
			{
				int tt = ttotal - taro[tc] + hanako[hc];
				int hh = htotal + taro[tc] - hanako[hc];
				if(tt == hh)
				{
					System.out.printf("%d %d\n", taro[tc], hanako[hc]);
					return;
				}
			}
		}
		
		System.out.println("-1");
	}
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			n = sca.nextInt();
			m = sca.nextInt();
			if(n == 0) break;
			
			taro = new int[n];
			for(int i=0;i < n;i++) taro[i] = sca.nextInt();
			
			hanako = new int[m];
			for(int i=0;i < m;i++) hanako[i] = sca.nextInt();
			
			start();
		}
	}
}