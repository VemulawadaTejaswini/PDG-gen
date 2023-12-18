
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	
	static int [][]grid;
	static int h,w;
	static List<Point> ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 h = Integer.parseInt(sc.next());
		 w = Integer.parseInt(sc.next());
		 
		 grid = new int [h+1][w+1];
		 
		 for(int i = 1 ; i <= h ;i++) {
			 for(int j = 1 ; j <= w ; j++) {
				 grid[i][j] = Integer.parseInt(sc.next());
			 }
		 }
		 
		 ans = new ArrayList<Point>();
		 boolean flag = false;
		
		 for(int i = 1 ; i < h ; i++) {
			 for(int j = 1 ; j <= w ; j++) {
				 if(grid[i][j] % 2 == 1) {
					 grid[i+1][j]++;
					 ans.add(new Point(i,j,i+1,j));
				 }
			 }
		 }
		 
		 for(int i = 1 ; i < w ; i++) {
			 if(grid[h][i] % 2 == 1) {
				 ans.add(new Point(h,i,h,i+1));
				 grid[h][i+1]++;
			 }
		}
	
		System.out.println(ans.size());
		for(Point e : ans) {
			System.out.println(e.getY()+" "+e.getX()+" "+e.getYy()+" "+e.getXx());
		}
	}	
}
class Point {
	private int y;
	private int x;
	private int yy;
	private int xx;
	
	public Point (int y, int x , int yy, int xx) {
		this.y = y;
		this.x = x;
		this.yy = yy;
		this.xx = xx;
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}

	public int getYy() {
		return yy;
	}

	public int getXx() {
		return xx;
	}
	
	
}
