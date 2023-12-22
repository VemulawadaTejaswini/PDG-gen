
import java.util.Scanner;

public class Main {
 static int     max   = 0;
 static int     count = 100;
 static int[][] p     = new int[10][10];

 public static void main(String[] args) {
	Scanner in = new Scanner(System.in)
	  .useDelimiter("[^0-9]+");
	max = 0;
	count = 0;
	for (int i = 0; i < p.length; i++) {
	 for (int j = 0; j < p[i].length; j++) {
		p[i][j] = 0;
	 }
	}
	while (in.hasNextLine()) {
	 ink(in.nextInt(), in.nextInt(), in.nextInt());
	}
	System.out.println(count);
	System.out.println(max);

 }

 static void ink(int x, int y, final int size) {
	if (size >= 3) {
	 pi(x + 2, y);
	 pi(x - 2, y);
	 pi(x, y + 2);
	 pi(x, y - 2);
	}
	if (size >= 2) {
	 pi(x + 1, y + 1);
	 pi(x + 1, y - 1);
	 pi(x - 1, y + 1);
	 pi(x - 1, y - 1);
	}
	if (size >= 1) {
	 pi(x + 1, y);
	 pi(x - 1, y);
	 pi(x, y + 1);
	 pi(x, y - 1);
	}
	pi(x, y);
 }

 static void pi(int x, int y) {
	if (0 <= x && x < 10 && 0 <= y && y < 10) {
	 if (p[x][y] == 0) {
		count--;
	 }
	 p[x][y]++;
	 max = Math.max(max, p[x][y]);
	}
 }
}