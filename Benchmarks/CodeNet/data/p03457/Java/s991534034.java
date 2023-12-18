import java.util.Scanner;

public class Main {
	static public void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] tArray = new int[n];
		int[] xArray = new int[n];
		int[] yArray = new int[n];
		for (int i = 0; i < n; i++) {
			tArray[i] = scan.nextInt();
			xArray[i] = scan.nextInt();
			yArray[i] = scan.nextInt();
		}
		scan.close();

		int currentT = 0;
		int currentY = 0;
		int currentX = 0;
		for (int i = 0; i < n; i++) {
			int nextT = tArray[i];
			int nextX = xArray[i];
			int nextY = yArray[i];
			int diffT = nextT - currentT;
			int diffX = nextX - currentX;
			int diffY = nextY - currentY;
			int remainT = diffT - diffX - diffY;
			if (remainT < 0 || (remainT) % 2 == 1) {
				System.out.println("No");
				return;
			}
			currentT = nextT;
			currentX = nextX;
			currentY = nextY;
		}
		System.out.println("Yes");
	}
}
