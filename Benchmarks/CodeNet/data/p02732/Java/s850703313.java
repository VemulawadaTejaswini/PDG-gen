import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int maxn=(int) (2e5+10);
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int vis[]=new int [maxn];
		int a[]=new int[maxn];
		int n=cin.nextInt();
		for(int i=1;i<=n;i++)
		{
			a[i]=cin.nextInt();vis[a[i]]++;
		}
		
		//long ans[]=new int[maxn];
		long sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=vis[i]*(vis[i]-1)/2;
		}
		//System.out.println(sum);
		for(int i=1;i<=n;i++)
		{
			System.out.println(sum-vis[a[i]]+1);
		}
		
	}

	
}