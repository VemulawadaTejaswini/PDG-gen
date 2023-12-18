import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		sc.close();

		int num = 1;
		for(int i = 1; i <= N; i++) {
			if(num <= K) {
				num *= 2;
			}else {
				num += K;
			}
		}
		System.out.println(num);
	}
}