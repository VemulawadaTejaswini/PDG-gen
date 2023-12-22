import java. util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();
		int m = scan.nextInt();

		double s = (h*60+m)*(0.5);
		double l = m*6;

		double kaku = s-l;

		if(kaku>180) {
			kaku = 360-kaku;
		}

		double cos = Math.cos(Math.toRadians(kaku));

		double result2 = a*a + b*b - 2*a*b*cos;

		double result = Math.sqrt(result2);

		System.out.println(result);

	}

}
