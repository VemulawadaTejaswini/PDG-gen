import java.util.Scanner;

// Java8
public class Main
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}
	
	void run()
	{
		int n = sc.nextInt();
		int[] as = new int[n+1];
		for(int i=1; i<=n; i++) as[i] = sc.nextInt();
		int p = 1;
		for(int i=1; i<=n; i++)
		{
			p = as[p];
			if(p==2)
			{
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
	
}
