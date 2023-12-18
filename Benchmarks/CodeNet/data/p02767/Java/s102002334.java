
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ary = new int[n];
		for(int i = 0; i < n; i++){
			ary[i] = sc.nextInt();
		}
		int minPower = Integer.MAX_VALUE;
		for(int i = 1; i < 101; i++){
			int power = 0;
			for(int i2 = 0; i2 < n; i2++){
				power += (i - ary[i2]) * (i - ary[i2]);
			}
			minPower = Math.min(minPower, power);
		}
		System.out.println(minPower);
	}
}
