import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.close();
		// 出力
		prtln((H - h) * (W - w));
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}