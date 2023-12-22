import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		int[] price = new int[N];
		int total = 0;

		for(int i=0;i<N;i++) {
			price[i] = stdIn.nextInt();
		}

		Arrays.sort(price);

		for(int i=0;i<K;i++) {
			total += price[i];
		}

		System.out.println(total);
		stdIn.close();
	}

}