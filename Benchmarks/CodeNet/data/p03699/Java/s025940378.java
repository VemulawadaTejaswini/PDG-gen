
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int N = scan.nextInt();
		int[] s = new int[N];
		for(int i = 0; i < N; i++) {
			s[i] = scan.nextInt();
			sum += s[i];
		}
		Arrays.sort(s);
		if(sum % 10 == 0) {
			for(int i = 0; i < N; i++) {
				if(s[i] % 10 != 0) {
					sum -= s[i];
					break;
				}
				if(i == N - 1) {
					sum = 0;
					break;
				}
			}
		}
		System.out.println(sum);
		scan.close();

	}

}
