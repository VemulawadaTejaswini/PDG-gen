import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int res = 0;
		int r = 0;
		int sum = 0;
		for(int l=0;l<n;l++) {
			 while(r<n && (sum^a[r])==(sum+a[r])) {
				 sum += a[r++];
			 }
			res += r-l;
			sum -= a[l];
		}
		System.out.println(res);
		in.close();
	}

}