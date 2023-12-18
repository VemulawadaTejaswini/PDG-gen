import java.util.Scanner;
class Main {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long a[] = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextLong();

		String ans = "No";
		for (int j = 0; j < n; j++) {
			long hh = a[j];
			long w;
			if (j > 0) {
				w = a[j];
				a[j] = a[0];
				a[0] = w;
			}

			for (int i = 1; i < n-1; i++) {
				for(int k=i+1;k<n;k++) {
					if (hh == (a[i] ^ a[k])) {
						ans = "Yes";
						break;
					}
				}
				if (ans.equals("Yes"))
					break;
			}
			if (ans.equals("Yes"))
				break;
		}
		System.out.println(ans);
    }
}