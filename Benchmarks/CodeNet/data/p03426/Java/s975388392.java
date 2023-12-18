import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		Point[] points = new Point[h * w + 1];
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        points[sc.nextInt()] = new Point(i, j);
		    }
		}
		int[] sums = new int[h * w + 1];
		for (int i = d + 1; i <= h * w; i++) {
		    sums[i] = sums[i - d];
		    sums[i] += points[i].getValue(points[i - d]);
		}
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    sb.append(- sums[sc.nextInt()] + sums[sc.nextInt()]).append("\n");
		}
		System.out.print(sb);
    }
    
    static class Point {
        int x;
        int y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        public int getValue(Point another) {
            return Math.abs(x - another.x) + Math.abs(y - another.y);
        }
    }
}

