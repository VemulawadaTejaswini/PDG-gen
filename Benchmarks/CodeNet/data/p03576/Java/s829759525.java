import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Point[] arr = new Point[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr, new Comparator<Point>() {
		    public int compare(Point p1, Point p2) {
		        return p1.x - p2.x;
		    }
		});
		long min = Long.MAX_VALUE;
		for (int i = 0; i < n - k + 1; i++) {
		    ArrayList<Point> list = new ArrayList<>();
		    for (int j = i; j < i + k; j++) {
		        list.add(arr[j]);
		    }
		    long xValue = arr[i + k -1].x - arr[i].x;
		    Collections.sort(list, new Comparator<Point>() {
		        public int compare(Point p1, Point p2) {
		            return p1.y - p2.y;
		        }
		    });
		    long yValue = list.get(list.size() - 1).y - list.get(0).y;
		    min = Math.min(min, xValue * yValue);
		    for (int j = i + k; j < n; j++) {
		        list.add(arr[j]);
		        xValue = arr[j].x - arr[i].x;
    		    Collections.sort(list, new Comparator<Point>() {
    		        public int compare(Point p1, Point p2) {
    		            return p1.y - p2.y;
    		        }
    		    });
		        for (int a = 0; a + k < list.size(); a++) {
		            min = Math.min(min, xValue * (list.get(a + k).y - list.get(a).y));
		        }
		    }
		}
        System.out.println(min);
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


