import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);

		int H = a.nextInt();
		int W = a.nextInt();
      a.close();
		Scanner b = new Scanner(System.in);
		int h = b.nextInt();
		int w = b.nextInt();
      b.close();
		int ans = (H - h) * (W - w);
		System.out.println(ans);

	}

}
