import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.nextLine();
		str = sc.nextLine();
		sc.close();
		int l1=0;
		int l2=0;
		int ans = 0;
		char[] c = str.toCharArray();
		int i, j, k;
		for (i=0; i < n; i++) {
			for (j=i+1; j< n; j++) {
				if (c[i] !=c[j]) {
					l1 = j-i;
					for (k=j+1; k<n; k++) {
						if (c[k]!=c[j] && c[k]!=c[i] ) {
							l2 = k-j;
							if (l1!=l2) ans +=1;
						}
					}
				}
			}
		}

		System.out.println(ans);
	}
}
