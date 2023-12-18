import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] rate = new int[8];
		int red = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(3200 <= a) {
				red++;
			} else {
				rate[(a/400)]++;
			}
		}
		int min = 0;
		int max = 0;
		for(int i = 0; i < 8; i++) {
			if(rate[i] >= 1) {
				min++;
			}
		}
		min = Math.max(min, 1);
		max = Math.min(8, min+red);
		System.out.println(min+" "+max);
	}
}