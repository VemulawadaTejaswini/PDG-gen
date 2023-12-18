import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		tp:while(true) {
			for(int A:a) {
				if((A%2)!=0) {
					break tp;
				}
			}
			for(int A:a) {
				A/=2;
			}
			count++;
		}
		System.out.println(count);
	}
}