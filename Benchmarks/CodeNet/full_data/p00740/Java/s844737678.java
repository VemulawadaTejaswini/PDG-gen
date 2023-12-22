import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	
	static int n, p;
	
	static void start()
	{
		int[] have = new int[n];
		for(int i = 0;i < n;i++) have[i] = 0;
		
		int whoturn = 0;
		int owan = p;
		while(true)
		{
			if(owan != 0)
			{
				have[whoturn]++;
				owan--;
				if(have[whoturn] == p) break;
			}
			else
			{
				owan = have[whoturn];
				have[whoturn] = 0;
			}
			
			whoturn++;
			if(whoturn == n) whoturn = 0;
		}
		
		System.out.println(whoturn);
	}
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			n = sca.nextInt();
			p = sca.nextInt();
			if(n == 0) break;
			
			start();
		}
	}
}