import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)a[i] = sc.nextInt();
		int max = 0;
		for (int i = 0; i < n; i++) {
			max=0;
			for (int j = 0; j < n; j++) {
				if (i != j)max = Math.max(max, a[j]);
			}
			System.out.println(max);
		}
	}
}
