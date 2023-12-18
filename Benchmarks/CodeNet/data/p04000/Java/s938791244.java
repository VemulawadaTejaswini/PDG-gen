/* Filename: ABC045D.java
 * Author: Mushiyo
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	static int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
	static int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int H = input.nextInt(), W = input.nextInt(), N = input.nextInt();
			
			if(N == 0){
				System.out.println((long)(H - 2) * (W - 2));
				
				for(int i = 1; i <= 9; ++i){
					System.out.println(0);
				}
				
				continue;
			}
			
			Point[] p = new Point[N];
			
			for(int i = 0; i < p.length; ++i){
				p[i] = new Point(input.nextInt(), input.nextInt());
			}
			
			PointComparator pointComparator = new PointComparator();
			Arrays.sort(p, pointComparator);
			
			long[] count = new long[10];
			for(int i = 2; i < H; ++i){
				for(int j = 2; j < W; ++j){
					int countBlack = 0;
					for(int d = 0; d < dx.length; ++d){
						int a = i + dx[d];
						int b = j + dy[d];
						
						if(Arrays.binarySearch(p, new Point(a, b), pointComparator) > -1){
							++countBlack;
						}
					}
					
					++count[countBlack];
				}
			}
			
			for(long i : count){
				System.out.println(i);
			}
		}
		
		
			
	}
	
	private static class Point{
		int a, b;
		
		Point(int a, int b){
			this.a = a;
			this.b = b;
		}
	}

	static class PointComparator implements Comparator<Point> {

		@Override
		public int compare(Point p1, Point p2) {
			if(p1.a == p2.a){
				return p1.b - p2.b;
			} else {
				return p1.a - p2.a;
			}
		}
	}
}
