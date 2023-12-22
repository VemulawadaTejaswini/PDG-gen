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
		for(int i = 1; i <= T; i++) {
			// i秒後のAの位置
			long posA = A + (i * V);
			// i秒後のBの位置
			long posB = B + (i * W);
			if(posA == posB) {
				prtln("YES");
				return;
			}
		}
		prtln("NO");
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}
