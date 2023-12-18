import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[m];
		int b[] = new int[m];
		int c[] = new int[n];
		for(int i=0;i<m;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		for(int i=0;i<n;i++) {
			c[i] = 0;
		}

		int t = 1;

		for(int i=0;i<n-1;i++) {
			c[i] = 1;
			for(int j=0;j<m;j++) {
				t = 1;
				for(int k = a[j]-1;k<b[j]-1;k++) {
					t = t*c[k];
				}
				if(t != 0) {
					c[i] = 0;
					break;
				}
			}
		}

		int sum = 0;
		for(int i=0;i<n-1;i++) {
			if(c[i] == 0) {
				sum += 1;
			}
		}

		System.out.println(sum);

	}
}