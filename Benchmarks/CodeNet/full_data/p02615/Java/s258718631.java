import java.util.*;

class Main
{
	public static void main(String args[]) throws Exception
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int [] a=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		long ans=0;
		if (n % 2 != 0) {
            ans += a[n / 2];
            for (int i = n / 2 + 1; i < n - 1; i++) {
                ans = ans + 2 * a[i];
            }
            ans += a[n - 1];
        } else {
            for (int i = n / 2; i < n - 1; i++) {
                ans = ans + 2 * a[i];
            }
            ans += a[n - 1];
        }
		System.out.println(ans);
	}
}