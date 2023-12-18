import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int[] x = {a, b, c};
		Arrays.sort(x);
		for(int i = 0 ; i < k ; i++) x[2] *= 2;
		int sum = 0;
		for(int i = 0 ; i < 3 ; i++) sum += x[i];
		System.out.println(sum);

	}
}
