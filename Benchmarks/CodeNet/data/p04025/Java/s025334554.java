import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int min = 1000000;
		for(int t = -101;t<=101;t++) {
			int sum =0;
			for(int i=0;i<n;i++) {
				sum+=(t-a[i])*(t-a[i]);
			}
			min = Math.min(min,sum);
		}
		System.out.println(min);
	}
}
