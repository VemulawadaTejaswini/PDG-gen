import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();

		double theta_min = 6.0*M;
		double theta_hour = 30.0*H+0.5*M;

		double theta = Math.abs(theta_min - theta_hour);

		double result = A*A + B*B - 2*A*B*Math.cos(Math.toRadians(theta));
	    System.out.println(Math.sqrt(result));

	}

}