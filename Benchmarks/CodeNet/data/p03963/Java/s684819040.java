import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner vd = new Scanner(System.in);
		int n = vd.nextInt();
		int k = vd.nextInt();
		vd.close();
		int s = (int)Math.pow(k-1, n-1);
		System.out.println(k*s);

	}

}
