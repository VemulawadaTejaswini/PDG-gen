import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int H = sc.nextInt();
		int W = sc.nextInt();
		int s = H * W;
		int h = sc.nextInt();
		int w = sc.nextInt();
		s -= h * W + w * H - h * w;
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
