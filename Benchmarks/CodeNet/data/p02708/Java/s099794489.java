import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int mod = 1000000007;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		long []mini= new long[n+2];
		long []maxi= new long[n+2];

		long ans = 0;
		for (int i=k; i<=n+1;i++) {
			ans += max(i, n, maxi) - min(i, mini) +1;
		}
		System.out.println(ans%mod);
	}

	private static long max(int i, int n, long[] maxi)
	{
		if (i==1) {
			maxi[i]=1;
		} else if (maxi[i-1] == 0) {
			maxi[i]=max2(i, n);
		} else {
			maxi[i]=maxi[i-1]+n-i+1;
		}
		return maxi[i];
	}

	private static long max2(int i, int n)
	{
		long ans = 0;
		int k = n;
		for (int j=0; j<i; j++) {
			ans += k;
			k--;
		}
		return ans;
	}

	private static long min(int i, long[] mini)
	{
		if (i==1) {
			mini[i]=0;
		} else if (mini[i-1] == 0) {
			mini[i]=min2(i);
		} else {
			mini[i]=mini[i-1]+i-1;
		}
		return mini[i];
	}

	private static long min2(int i)
	{
		long ans = 0;
		int k = 0;
		for (int j=0; j<i; j++) {
			ans += k;
			k++;
		}
		return ans;
	}
}
