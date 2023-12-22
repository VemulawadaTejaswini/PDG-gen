import java.util.Scanner;

public class Main {

 private static int     max   = 0;
 private static int     count = 100;
 private static int[][] ps;

 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	ps = new int[14][14];
	while (in.hasNextLine()) {
	 String[] data = in.nextLine().split(",");
	 int x = Integer.parseInt(data[0]);
	 int y = Integer.parseInt(data[1]);
	 int size = Integer.parseInt(data[2]);
	 spoit(x, y);
	 spoit(x + 1, y);
	 spoit(x - 1, y);
	 spoit(x, y + 1);
	 spoit(x, y - 1);
	 if (size >= 2) {
		if (y - 1 >= 0) {
		 spoit(x + 1, y - 1);
		 spoit(x - 1, y - 1);
		}
		if (y + 1 < 10) {
		 spoit(x + 1, y + 1);
		 spoit(x - 1, y + 1);
		}
	 }
	 if (size >= 3) {
		spoit(x + 2, y);
		spoit(x - 2, y);
		spoit(x, y + 2);
		spoit(x, y - 2);
	 }
	}
	System.out.println(count);
	System.out.println(max);

 }

 private static void spoit(int x, int y) {
	if (0 <= x && x < 10 && 0 <= y && y < 10) {
	 if (ps[x][y] == 0) {
		count--;
	 }
	 int result = ps[x][y] + 1;
	 max = Math.max(result, max);
	 ps[x][y] = result;
	}
 }
}