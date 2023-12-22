import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 1
		int B = sc.nextInt(); // 0
		int C = sc.nextInt(); // -1
		long K = sc.nextLong(); // 取るカードの枚数
		sc.close();
		long answer = 0L;
		if(K <= A) {
			answer = K;
		} else if(K <= (A + B)) {
			answer = A;
		} else {
			answer = A - (K - A - B); 
		}
		System.out.println(answer);
	}
}