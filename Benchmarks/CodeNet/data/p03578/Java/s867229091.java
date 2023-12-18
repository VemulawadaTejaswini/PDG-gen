import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] t = new int[m];
		for (int i = 0; i < m; i++) {
			t[i] = sc.nextInt();
		}

		/*int i, j = 0;
		if (n >= m) {
			for (i = 0; i < m; i++) {

				for (j = 0; j < n; j++) {
					if (d[j] != -1 && d[j] == t[i]) {
						d[j] = -1;
						break;
					}
				}
				if (j >= n) {
					break;
				}
			}

			if (j >= n) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		} else {
			System.out.println("NO");
		}*/
		
		int[] df = new int[200000];
		int[] tf = new int[200000];
		
		for(int x : d) {
			df[x]++;
		}
		
		for(int x : t) {
			tf[x]++;
		}
		
		for(int i = 0; i < 200000; i++) {
			if(df[i] < tf[i]) {
				System.out.println("NO");
				System.exit(0);
			}
		}
		System.out.println("YES");
	}
}