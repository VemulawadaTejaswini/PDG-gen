import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a;
		a = new int[1000];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[j]<a[i]) {
					int x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
		System.out.printf("%d",a[0]);
		for(int i=1; i<n; i++) {
			System.out.printf(" %d",a[i]);
		}
	}
}