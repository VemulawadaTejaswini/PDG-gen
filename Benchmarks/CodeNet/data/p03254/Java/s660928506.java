
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[n];
		for (int i=0;i<n;i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		int count=0;
		int sum=0;
		for (int i=0;i<n;i++) {
			sum+=a[i];
			if (sum==x || (i!=n-1 && sum<x)) count++;
		}
		System.out.println(count);
	}
}
