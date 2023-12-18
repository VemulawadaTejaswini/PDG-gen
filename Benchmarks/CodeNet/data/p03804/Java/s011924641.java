import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		String[] a = new String[n];
		String[] b = new String[m];

		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}

		for (int i = 0; i < m; i++) {
			b[i] = sc.next();
		}

		int i;
		for(i = 0; i < n-m+1; i++) {
			int j;
			for(j = 0; j < n-m+1; j++) {
				int k;
				for(k = 0; k < m; k++) {
					if(!b[k].equals(a[i+k].substring(j,  j+m))) {
						break;
					}
				}
				if(k >= m) {
					System.out.println("Yes");
					System.exit(0);
				}
				
			}
			
		}
		
		System.out.println("No");		

	}
}

