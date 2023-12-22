import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long V = sc.nextLong();
		long B = sc.nextLong();
		long W = sc.nextLong();
		long T = sc.nextLong();
		sc.close();
		long v = V;
		long w = W;
		if(A > B) {
			v *= -1;
			w *= -1;
		}
		for(int i = 1; i <= T; i++) {
			// i秒後のAの位置
			long posA = A + (i * v);
			// i秒後のBの位置
			long posB = B + (i * w);
			if(posA == posB) {
				prtln("YES");
				return;
			}
		}
		prtln("NO");
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}
