import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Long k = sc.nextLong();
		String str = sc.nextLine();
		Long [] a = new Long[n+1];
		Long [] b = new Long[m+1];
		a[0] = new Long(0);
		for (int i= 1; i<n+1; i++) {
			a[i] = a[i-1]+sc.nextLong();
		}
		str = sc.nextLine();
		b[0] = new Long(0);
		for (int i= 1; i<m+1; i++) {
			b[i] = b[i-1]+sc.nextLong();
		}
		sc.close();

		Long remain = k - a[n];
		int minb = 1;
		if (remain > b[1]) {
			minb = Arrays.binarySearch(b, remain);
			if (minb<0) {
				minb= Math.abs(minb) -2;
			}
		}
		int ans = 0;
		int ai = 0;
		for (int i=minb; i<m+1; i++) {
			remain = k-b[i];
			ai = Arrays.binarySearch(a, remain);
			if (ai<0) {
				ai = Math.abs(ai) - 2;
			}
			if (ai>-1) {
				ans = Math.max(ans, ai+i);
			}
			if (ai<=0) {
				break;
			}
		}
		System.out.println(ans);
	}

}

