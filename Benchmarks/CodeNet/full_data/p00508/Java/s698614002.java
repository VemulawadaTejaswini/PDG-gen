import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vertex[] v = new Vertex[n];
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			v[i] = new Vertex(x,y);
		}
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				min = Math.min(min, (v[i].x - v[j].x) * (v[i].x - v[j].x) + (v[i].y - v[j].y) * (v[i].y - v[j].y));
			}
		}
		System.out.println(min);
		
		
	}
	static class Vertex implements Comparable<Vertex>{
		int x;
		int y;
		Vertex(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(Vertex o) {
			return (this.x - o.x) * (this.x - o.x) + (this.y - o.y) * (this.y - o.y);
		}
	}
 }