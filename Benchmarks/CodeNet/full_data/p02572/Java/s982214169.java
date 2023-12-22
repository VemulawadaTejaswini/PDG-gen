import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long arr[] = new long[n];
		int mod = (int)1e9 + 7;
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextLong();
		}
		long ans = 0;
		for(int i = 0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				ans =(ans + (arr[i] * arr[j]) % mod)% mod;
			}
		}
		System.out.println(ans);
		sc.close();
		
	}

}
