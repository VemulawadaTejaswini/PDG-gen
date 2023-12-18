import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int count = 0;
		int x = Integer.MAX_VALUE;

		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}

		for(int i=0;i<n;i++) {
			x=Math.min(x, a[i]);
			if(x==a[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}