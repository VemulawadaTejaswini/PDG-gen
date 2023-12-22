import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 1
		int B = sc.nextInt(); // 0
		int C = sc.nextInt(); // -1
		long K = sc.nextLong(); // 取るカードの枚数
		sc.close();
		long answer = A;
		long nokori = K - A;
		if(nokori > B) {
			nokori -= B;
		} else {
			nokori = 0L;
		}
		if(nokori > C) {
			answer += -(C);
		} else {
			answer += -(nokori);
		}
		System.out.println(answer);
	}
}