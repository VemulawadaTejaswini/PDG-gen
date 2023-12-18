import java.util.Scanner;

public class Main 
{
	static boolean[][] edge;
	static int n, m;
	static long c = 0;
	
	static void go(String s)
	{
//		System.out.println(s);
		if(s.length() == n)
		{
			c++;
			return;
		}
		boolean[] vis = new boolean[n];
		for(int i = 0; i < s.length(); i++)
		{
			vis[s.charAt(i)-'0'] = true;
		}
		int cur = s.charAt(s.length()-1)-'0';
		for(int i = 0; i < n; i++)
		{
			if(!vis[i] && edge[cur][i])
				go(s + ((char)('0'+i)));
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		edge = new boolean[n][n];
		
		for(int i = 0; i < m; i++)
		{
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			edge[a][b] = true;
			edge[b][a] = true;
		}
		
		go("0");
		System.out.println(c);
	}
		

}

