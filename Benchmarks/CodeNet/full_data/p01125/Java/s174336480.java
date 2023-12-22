import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n; //宝石数
		int event;//イベント数
		ArrayList<int[]> juels;

		juels = new ArrayList<int[]>();
		int x = 10;
		int y = 10;
		while (scan.hasNext()) {
			n = scan.nextInt();
			if (n == 0) {
				scan.close();
				break;
			}
			//宝石の座標をセット
			for (int i = 0; i < n; i++) {
				juels.add(new int[] { scan.nextInt(), scan.nextInt() });
			}
			event = scan.nextInt();
			String direction;

			int len;
			int count=0;
			for (int i = 0; i < event; i++) {
				direction = scan.next();
				len = scan.nextInt();

				for (int j = 0; j < len; j++) {
					if (direction.equals("S")) {
						y -= 1;
					} else if (direction.equals("N")) {
						y += 1;
					} else if (direction.equals("W")) {
						x -= 1;
					} else if (direction.equals("E")) {
						x += 1;
					}
					count+=checkjuel(juels, x, y);
				}

			}
			if(count==n) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}

		}
	}

	private static int checkjuel(ArrayList<int[]> juels, int x, int y) {
		for (int pos = 0; pos < juels.size(); pos++) {

			if (juels.get(pos)[0] == x && juels.get(pos)[1] == y) {
				return 1;
			}
		}
		return 0;
	}
}
