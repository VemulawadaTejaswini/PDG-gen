
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt(); //座標1移動したときの疲労度
		int b = sc.nextInt(); //TP

		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		long sum = 0;
		for(int i = 1; i < n; i++) {
			int dist = array[i] - array[i - 1];
			if(dist * a >= b) {
				sum += b;
			} else {
				sum += dist * a;
			}
		}

		System.out.println(sum);

	}
}

