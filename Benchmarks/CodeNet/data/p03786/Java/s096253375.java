import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		int ans = 1;
		int o = a[0];
		for (int i = 1; i < n; i++) {
			if (o*2>=a[i]){
				ans++;
				o+=a[i];
			}else{
				ans = 1;
				o+=a[i];
			}

		}
		System.out.println(ans);
	}
}