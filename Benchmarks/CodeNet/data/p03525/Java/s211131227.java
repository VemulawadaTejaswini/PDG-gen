import java.util.Scanner;

public class Main 
{
	static int dif(int a, int b)
	{
		int ma = Math.max(a, b);
		int mi = Math.min(a, b);
		return Math.min(b-a, 24 - (b-a));
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			int c = sc.nextInt();
			a[i] = c;
			b[i] = 24-c;
		}
		
		int max = 0;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j<n; j++)
			{
				max = Math.max(max, dif(a[i],b[j]));
				max = Math.max(max, dif(b[i],a[j]));
				max = Math.max(max, dif(a[i],a[j]));
				max = Math.max(max, dif(b[i],b[j]));
			}
		}
		System.out.println(max);
	}

}
