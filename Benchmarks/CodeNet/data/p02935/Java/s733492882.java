
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] ary = new double[n];
		for(int i = 0; i < n; i++){
			ary[i] = sc.nextDouble();
		}
		Arrays.sort(ary);
		double ans = ary[0];
		for(int i = 1; i < n; i++){
			ans = (ans + ary[i]) / 2;
		}
		System.out.println(ans);
	}
}
