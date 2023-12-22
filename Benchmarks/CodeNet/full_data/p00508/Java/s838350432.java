import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static int min_dist_2(final int n, final int start, final Point[] points){
		if(n <= 1){
			return Integer.MAX_VALUE;
		}
		
		final int m = n / 2;
		
		int d = Math.min(min_dist_2(m, start, points), min_dist_2(n - m, start + m, points));
		
		LinkedList<Point> list = new LinkedList<Point>();
		final int x = points[start].x;
		for(int i = 0; i < n; i++){
			final int pos = start + i;
			
			final int tmp_d = (points[pos].x - x) * (points[pos].x - x);
			if(tmp_d >= d){
				continue;
			}
			
			for(Point another : list){
				final int dx = points[pos].x - another.x;
				final int dy = points[pos].y - another.y;
				/*
				if(dy > 0 && dy * dy >= d){
					break;
				}
				*/
				d = Math.min(d, dx * dx + dy * dy);
			}
			
			list.add(points[pos]);
		}
		
		return d;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		Point[] points = new Point[n];
		
		for(int i = 0; i < n; i++){
			points[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		
		Arrays.sort(points, new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				if(o1.x != o2.x){
					return o1.x - o2.x;
				}else{
					return o1.y - o2.y;
				}
			}
		});
		
		System.out.println(min_dist_2(n, 0, points));
	}

}