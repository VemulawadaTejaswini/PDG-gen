import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		int q=sc.nextInt();
		long[] a=new long[n];
		Arrays.fill(a, k);
		int count=0;
		for(int i=0;i<q;i++) {
			a[sc.nextInt()-1]++;
		}
		for(int i=0;i<n;i++) {
			if(a[i]>q) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}

