import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int i = 0;
		int num = 1;

		while(num < K) {
			num *= 2;
			i += 1;
		}for(int j=1; j<=N-i; j++) {
			num += K;
		}
		System.out.println(num);
	}

}
