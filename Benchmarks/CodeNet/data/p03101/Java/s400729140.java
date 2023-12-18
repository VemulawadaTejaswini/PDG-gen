import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();

		if (h >= 0) {
			H = H - h;
		}
		if (w >= 0) {
			W = W - w;
		}
      	if (H < 0) {
			H = 0;
		}
		if (W < 0) {
			W = 0;
		}
      
		System.out.println(H * W);

	}

}
