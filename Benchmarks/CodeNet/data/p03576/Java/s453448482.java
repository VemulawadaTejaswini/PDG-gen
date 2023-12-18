import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Point[] xSortedPoints = new Point[n];
		Point[] ySortedPoints = new Point[n];
		for (int i = 0; i < n; i++) {
		    Point p = new Point(sc.nextInt(), sc.nextInt());
		    xSortedPoints[i] = p;
		    ySortedPoints[i] = p;
		}
		Arrays.sort(xSortedPoints, new Comparator<Point>() {
		    public int compare(Point p1, Point p2) {
		        return p1.x - p2.x;
		    }
		});
		Arrays.sort(ySortedPoints, new Comparator<Point>() {
		    public int compare(Point p1, Point p2) {
		        return p1.y - p2.y;
		    }
		});
		int left = 0;
		int right = k - 1;
		long minTotal = Long.MAX_VALUE;
		while (right < n) {
		    for (int i = 0; i + right < n; i++) {
		        int minX = xSortedPoints[left].x;
		        int maxX = xSortedPoints[i + right].x;
		        long width = maxX - minX;
		        int up = 0;
		        while (ySortedPoints[up].x < minX || ySortedPoints[up].x > maxX) {
		            up++;
		        }
		        int down = up;
		        for (int j = 0; j < k - 1; j++) {
		            down++;
		            while (ySortedPoints[down].x < minX || ySortedPoints[down].x > maxX) {
		                down++;
		            }
		        }
		        boolean flag = true;
		        while (flag) {
		            minTotal = Math.min(minTotal, width * (ySortedPoints[down].y - ySortedPoints[up].y));
		            up++;
    		        while (ySortedPoints[up].x < minX || ySortedPoints[up].x > maxX) {
    		            up++;
    		        }
    		        down++;
    		        if (down >= n) {
    		            break;
    		        }
    		        while (ySortedPoints[down].x < minX || ySortedPoints[down].x > maxX) {
    		            down++;
    		            if (down >= n) {
    		                flag = false;
    		                break;
    		            }
    		        }
		        }
		    }
		    left++;
		    right++;
		}
		System.out.println(minTotal);
    }
    
    static class Point {
        int x;
        int y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

