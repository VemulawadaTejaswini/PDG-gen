import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong(); // 1
		long B = sc.nextLong(); // 0
		long C = sc.nextLong(); // -1
		long K = sc.nextLong(); // 枚数
		long ans;
		if(A >= K) { 
			ans = K;
		} else if (K <= A + B) {
			ans = A;
		} else {
			ans = 2 * A - K + B;
		}
		System.out.println(ans);
		sc.close();
	}
}