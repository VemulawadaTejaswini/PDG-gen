import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long a[] = new long[n];
		for (int i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		long sta, gol;
		long ans = 0;
		sta = 0;
		gol = 0;
		long nag = 0;

		if (n != 1) {
			for (int i = 0; i <= n - 2; i++) {
				if ((a[i] != a[i + 1])) {

					gol = i;
					nag = gol - sta + 1;
					sta = i + 1;
					if (a[i] < nag) {
						ans = ans - a[i] + nag;
						//System.out.println(1+" "+a[i]+" "+(nag-a[i]));
					} else if(a[i]>nag){
						//System.out.println(2+" "+a[i]+" "+nag);
				ans=ans+nag;
					}
				} else if (i == n - 2 && (a[i] == a[i + 1])) {

					gol = i + 1;
					nag = gol - sta + 1;
					sta = i + 1;

					if (a[i] < nag) {
						//System.out.println(3+" "+a[i]+" "+(nag-a[i]));
						ans = ans - a[i] + nag;
					} else if(a[i]>nag){
						//System.out.println(4+" "+a[i]+" "+(nag));
				ans=ans+nag;
					}
				}

			}
		} else {
			if (a[0] != 1) {
				ans = 1;
			} else {
				ans = 0;
			}
		}
		System.out.println(ans);
	}
}