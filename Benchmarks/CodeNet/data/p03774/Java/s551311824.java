import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), m = scanner.nextInt();
		
		Point[] students = new Point[n];
		Point[] checks= new Point[m];
		int[] ans = new int[n];
		
		for (int i = 0; i < students.length; i++) {
			students[i] = new Point(scanner.nextInt(), scanner.nextInt()); 
		}
		for (int i = 0; i < checks.length; i++) {
			checks[i] = new Point(scanner.nextInt(), scanner.nextInt());
		}
		for (int i = 0; i <  students.length; i++) {
			int[] distances = new int[m];
			for (int j = 0; j < checks.length; j++) {
				distances[j] = students[i].distance(checks[j]);
			}
			int number = 0, min =distances[0];
			for (int j = 1; j < distances.length; j++) {
				if (distances[j]<min) {
					min = distances[j];
					number = j;
				}
			}
			ans[i] = number;
		}
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]+1);
			
		}
		
		scanner.close();
	}
	
	static class Point{
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int distance(Point p) {
			int distanceX = 0;
			int distanceY = 0;
			if (x<p.x) {
				distanceX = p.x - x;
			}else{
				distanceX = x - p.x;
			}
			if (y<p.y) {
				distanceY = p.y - y;
			}else{
				distanceY = y - p.y;
			}
			return distanceX+distanceY;
		}
	}
}
