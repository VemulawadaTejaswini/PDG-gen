import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			if (h == 0 && w == 0)
				break;
			
			for (int i = 0; i < h; h++) {
				for (int j = 0; j < w; w++)
					System.out.print("#");
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}