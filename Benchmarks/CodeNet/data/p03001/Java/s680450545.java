import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double W = 0;
		double H = 0;
		double x = 0;
		double y = 0;
		Scanner sc = new Scanner(System.in);
		W = Integer.parseInt(sc.next());
		H = Integer.parseInt(sc.next());
		x = Integer.parseInt(sc.next());
		y = Integer.parseInt(sc.next());
		int flag = 0;
		double X = (W - x < x - 0) ? W - x : x - 0;
		double Y = (H - y < y - 0) ? H - y : y - 0;
		if (X * H > Y * W) {
			System.out.println(X * H + " " + flag);
		} else if (X * H == Y * W) {
			flag=1;
			System.out.println(X * H + " " + flag);
		}else
			System.out.println(Y * W + " " + flag);
		sc.close();
	}

}
