import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i ++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int max = 0;
		for(int i = 0; i <= k; i ++) {
			int sum = 0;
			for(int j = 0; j < n; j ++) {
				sum += i ^ a[j];
			}
			if(max < sum) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}
