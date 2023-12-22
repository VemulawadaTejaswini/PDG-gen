import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		long[] a = new long[n+1];
		long[] b = new long[m+1];
		
		a[0] = 0;
		for(int i=1;i<=n;i++) {
			a[i] = scan.nextLong()+a[i-1];
		}
		
		b[0] = 0;
		for(int i=1;i<=m;i++) {
			b[i] = scan.nextLong()+b[i-1];
		}
		
		int max = 0;
		int j = m;
		for(int i=0;i<=n;i++) {
			if(a[i] > k) {
				break;
			}
			while(j >= 0 && k < a[i]+b[j]) {
				j--;
			}
			max = Math.max(i+j, max);
		}
		System.out.println(max);

	}

}