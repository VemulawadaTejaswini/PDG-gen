import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.nextLine();
		String[] xArray = sc.nextLine().split(" ");
		String[] yArray = sc.nextLine().split(" ");

		String ans = "War";
		int xMax = Integer.parseInt(xArray[0]);
		int yMin = Integer.parseInt(yArray[0]);

		for (int i = 1; i < xArray.length; i++) {
		int xa = Integer.parseInt(xArray[i]);
			if (xa > xMax) {
				xMax = xa;
			}
		}

		for (int i = 1; i < yArray.length; i++) {
			int ya = Integer.parseInt(yArray[i]);
			if (ya < yMin) {
				yMin = ya;
			}
		}

		if(x <= xMax && xMax < yMin && yMin <= y){
			ans ="No War";
		}

		// 出力
		System.out.println(ans);
	}
}