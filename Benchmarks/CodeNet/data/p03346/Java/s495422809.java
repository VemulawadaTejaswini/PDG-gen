import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		new Main().run();
	}
	
	public void run() throws NumberFormatException, IOException
	{
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(file.readLine());
		boolean[] bools = new boolean[N+1];
		int[] ints = new int[N+1];
		int max = 0;
		for(int i = 0;i<N;i++)
		{
			int x = Integer.parseInt(file.readLine());
			bools[x] = true;
			if(bools[x-1])
				ints[x] = ints[x-1];
			else
				ints[x] = x;
			max = Math.max(max, x-ints[x]+1);
		}
		System.out.println(N - max);
	}
	
}
