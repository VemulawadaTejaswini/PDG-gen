import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");
		
		int n = Integer.parseInt(tmpArray[0]);
		int k = Integer.parseInt(tmpArray[1]);
		
		Point[] points = new Point[n];
		
		for(int i = 0; i < n; i++){
			tmpArray = br.readLine().split(" ");
			points[i] = new Point(Long.parseLong(tmpArray[0]), Long.parseLong(tmpArray[1]));
			
		}	
		
		Arrays.sort(points);
		
		//長方形を探索
		long minArea = Long.MAX_VALUE;
		for(int i = 0; i + k - 1 < n ; i++){
//			System.out.println("range "+i+" to "+(i + k - 1));
			long tmpArea = Math.abs((points[i + k - 1].x - points[i].x)*(maxY(points, i, i + k - 1) - minY(points, i, i + k - 1)));
//			System.out.println("dx "+(points[i + k - 1].x - points[i].x));
//			System.out.println("i = " + i + " area "+ tmpArea);
			if(tmpArea < minArea){
				minArea = tmpArea;
			}
		}
		
		System.out.println(minArea);
	}

	static long minY(Point[] points, int start, int end){
		long min = points[start].y;

		for(int i = start + 1; i <= end; i++){
			if(min > points[i].y){
				min = points[i].y;
			}
		}
		
		return min;
	}
	
	static long maxY(Point[] points, int start, int end){
		long max = points[start].y;

		for(int i = start + 1; i <= end; i++){
			if(max < points[i].y){
				max = points[i].y;
			}
		}
		
		return max;
	}

}

class Point implements Comparable<Point>{

	long x;
	long y;
	
	public Point(long x, long y){
		this.x = x;
		this.y = y;
	}
	
	public int compareTo(Point p) {
		// TODO Auto-generated method stub
		if(this.x > p.x){
			return 1;
		}
		else if(this.x == p.x){
			return 0;
		}
		else {
			return -1;
		}
	}
	
}