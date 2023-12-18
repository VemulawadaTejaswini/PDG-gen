import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner vd = new Scanner(System.in);
		int a = vd.nextInt();
		int b = vd.nextInt();
		int x = vd.nextInt();
		int y = vd.nextInt();
		vd.close();
		System.out.println(Math.min(a, b)+Math.min(x, y));

	}

}
