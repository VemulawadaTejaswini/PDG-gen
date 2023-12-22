import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] X = null;
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		X = ip.split(" ", 0);
		int W = Integer.parseInt(X[0]);
		int H = Integer.parseInt(X[1]);
		int x = Integer.parseInt(X[2]);
		int y = Integer.parseInt(X[3]);
		int r = Integer.parseInt(X[4]);


		if (r<=x&&x<=(W-r)&&r<=y&&y<=(H-r)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
