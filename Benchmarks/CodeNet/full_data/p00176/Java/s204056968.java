import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int r, g, b;
		String s;
		int map[][] = {{0, 0, 0}, {0, 0, 255}, {0, 255, 0}, {0, 255, 255}, {255, 0, 0}, {255, 0, 255}, {255, 255, 0}, {255, 255, 255}};
		String color[] = {"black", "blue", "lime", "aqua", "red", "fuchsia", "yellow", "white"};
		int minIndex;
		double min;
		
		while (true) {
			s = sc.next();
			if (s.equals("0")) {
				break;
			}
			
			r = Integer.decode("0x" + s.substring(1, 3)).intValue();
			g = Integer.decode("0x" + s.substring(3, 5)).intValue();
			b = Integer.decode("0x" + s.substring(5, 7)).intValue();
			
			minIndex = 0;
			min = Double.MAX_VALUE;
			for (int i = 0; i < 8; i++) {
				double dk = Math.sqrt(Math.pow(r - map[i][0], 2) + Math.pow(g - map[i][1], 2) + Math.pow(b - map[i][2], 2));
				if (dk < min) {
					min = dk;
					minIndex = i;
				}
			}
			System.out.println(color[minIndex]);
		}
	}
}