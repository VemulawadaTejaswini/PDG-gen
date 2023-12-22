import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[][] map = new int[n+1][n+1];
		Treasure[] treasure = new Treasure[n];
		
		for(int i=0;i<n;i++) {
			treasure[i] = new Treasure(sc.nextInt(),sc.nextInt());
		}
		
		Arrays.sort(treasure,new ComparatorX());
		for(int i=0;i<n;i++) {
			x[i] = treasure[i].x * 2;
			treasure[i].xindex = i;
		}
		
		Arrays.sort(treasure,new ComparatorY());
		for(int i=0;i<n;i++) {
			y[i] = treasure[i].y * 2;
			treasure[i].yindex = i;
		}
		
		for(int i=0;i<n;i++) {
			map[treasure[i].xindex+1][treasure[i].yindex+1]++;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				map[i][j] += map[i-1][j];
			}			
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				map[i][j] += map[i][j-1];
			}			
		}
		for(int i=0;i<m;i++) {
			int x1 = sc.nextInt()*2;
			int y1 = sc.nextInt()*2;
			int x2 = sc.nextInt()*2;
			int y2 = sc.nextInt()*2;
			x1 = binarySearch(x, x1-1)+1;
			y1 = binarySearch(y, y1-1)+1;
			x2 = binarySearch(x, x2+1)+1;
			y2 = binarySearch(y, y2+1)+1;
			System.out.println(map[x2][y2]-map[x2][y1]-map[x1][y2]+map[x1][y1]);
		}
		
	}
	public static int binarySearch(int[] array,int num) {
		int first = 0;
		int last = array.length-1;
		int center = (first+last)/2;
		while(first<=last) {
			if (center<array.length-1) {
				if (array[center] < num) {
					if (num < array[center+1]) {
						return center;
					}else{
						first = center+1;
					}
				}else{
					last = center-1;
				}
			}else{
				return array.length-1;
			}
			center = (first+last)/2;
		}
		return -1;
	}
	
}
class Treasure {
	int x=0;
	int y=0;
	int xindex = 0;
	int yindex = 0;
	public Treasure(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
class ComparatorX implements Comparator<Treasure> {
	public int compare(Treasure t1,Treasure t2) {
		return t1.x-t2.x;
	}
}
class ComparatorY implements Comparator<Treasure> {
	public int compare(Treasure t1,Treasure t2) {
		return t1.y-t2.y;
	}
}