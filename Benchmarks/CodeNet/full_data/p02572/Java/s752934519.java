
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long arr[] = new long[n];
		int mod = (int)1e9 + 7;
		long sum = 0;
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextLong();
			sum += arr[i];
			sum = sum % mod;
		}
		long ans = 0;
		for(int i = 0;i<n;i++)
		{
			sum -= arr[i];
			if(sum < 0)
				sum+=mod;
			
			ans += arr[i] * sum;
			ans %= mod;
			
		}
		System.out.println(ans);
		sc.close();
		
	}

}
