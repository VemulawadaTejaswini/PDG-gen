import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] hps = new int[n];
		for(int i = 0; i < n; i++) {
			hps[i] = sc.nextInt();
		}
		int ans = 0;
		for(;;ans++) {
			Arrays.sort(hps);
			if(hps[hps.length-1] <= 0) {
				break;
			} else {
				for(int i = 0; i < n; i++) {
					hps[i] = hps[i] - b;
				}
				hps[hps.length-1] = hps[hps.length-1]-a+b;
			}
		}
		System.out.println(ans);
	}
}