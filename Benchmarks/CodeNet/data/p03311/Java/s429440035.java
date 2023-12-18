import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int max = 0;
		for(int value : a) {
			if(max < value)
				max = value;
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {

			ans += Math.abs(a[i] - (-Math.abs(max - n) + (i+1)));
		}
		System.out.println(ans);
	}
}
