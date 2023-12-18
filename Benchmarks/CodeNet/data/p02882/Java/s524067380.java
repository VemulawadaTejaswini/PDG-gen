
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		String datas[] = data.split(" ");
		int a = Integer.parseInt(datas[0]);
		int b = Integer.parseInt(datas[1]);
		int x = Integer.parseInt(datas[2]);
		float x_ = x/a;
		if (x > Math.pow(a, 2)*b/2) {
			float x__ = a*b - x_;
			float h = 2*x__/a;
			double d = Math.atan(h/a);
			System.out.println(Math.toDegrees(d));
		}else {
			float h = 2*x_/b;
			double d = Math.atan(h/b);
			System.out.println(Math.toDegrees(Math.PI/2 - d));
			
		}
		


	}

}
