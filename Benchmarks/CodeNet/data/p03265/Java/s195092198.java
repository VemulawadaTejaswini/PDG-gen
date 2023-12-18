import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//B
		int x[] = new int[4];
		int y[] = new int[4];

		x[0] = sc.nextInt();
		y[0] = sc.nextInt();
		x[1] = sc.nextInt();
		y[1] = sc.nextInt();

		int disx = x[1] - x[0];
		int disy = y[1] - y[0];
		x[2] = x[1] - disy;
		y[2] = y[1] + disx;
		x[3] = x[2] - disx;
		y[3] = y[2] - disy;
		System.out.println(x[2] + " " + y[2] + " " + x[3] + " " + y[3]);
	}
}