import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			int N = sc.nextInt();
			int sum = 0;
			if(N == 0) {
				break;
			}
			for(int i = 1000; i > 0; i--) {
				sum += N / Math.pow(10, i);
				N %= Math.pow(10, i);
			}
			sum += N;
			System.out.println(sum);
		}
	}
}

