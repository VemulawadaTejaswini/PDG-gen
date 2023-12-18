import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Point p[] =new Point[n];
		for(int i = 0; i < n ; i++) {
			String[] s = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int l = Integer.parseInt(s[1]);
			p[i] = new Point(x, l);
		}
		List<Point> plist= Arrays.asList(p);
		Collections.sort(plist ,new Comparator() {
			public int compare(Object arg0, Object arg1) {
				return ((Point) arg0).getX() - ((Point)arg1).getX();
			}
		});
		Object[] p2 = plist.toArray();
		for(int i = 0; i < p.length;i++) {
			p[i] = (Point) p2[i];
		}

		while(true) {

			int[] ov = overWrapArray(p);
			if(isEnd(ov)) {				
				System.out.println(getNumOne(p));
				break;
			}
			int maxIndex = getMaxIndex(ov);
			p[maxIndex].setY(0);
			
		}

	}

	public static int[] overWrapArray(Point p[]) {
		int[] result = new int[p.length];
		for(int i = 0 , n = p.length;i<n;i++) {
			if(p[i].getY() == 0) {
				continue;
			}
			if(i > 0 ) {
				int currentIndex = i -1;
				while(p[currentIndex].getX() > p[i].getX() -p[i].getY() ) {
					if(p[currentIndex].getY() > 0) {result[i]++;}
					currentIndex--;
					if(currentIndex == -1) break;
				}
			}
			if(i < n-1) {
				int currentIndex = i+1;
				while(p[currentIndex].getX() < p[i].getX() +p[i].getY() ) {
					if(p[currentIndex].getY() > 0) {result[i]++;}
					currentIndex++;
					if(currentIndex == n) {break;}
				}
			}
		}
		return result;
	}
	static boolean isEnd(int[] result) {
		for(int i = 0 , n = result.length ; i < n ; i++) {
			if(result[i] >= 1) {
				return false;
			}
		}
		return true;
	}
	static int getMaxIndex(int[] ov) {
		int res = 0,max = 0;
		for(int i = 0, n = ov.length ; i<n;i++) {
			if(max < ov[i]) {
				res = i;
				max=ov[i];
			}
		}
		return res;
	}
	static int getNumOne(Point[] p) {
		int result = 0;
		for(int i = 0 , n = p.length ; i<n;i++) {
			if(p[i].getY() !=0) {
				result++;
			}
		}
		return result;
	}
	static void printArray(int x[]) {
		for(int i = 0 , n = x.length ; i< n; i++) {
			System.out.print(x[i]);
			System.out.print(" ");
		}
		System.out.println();
	}

}

class Point {
	private int x;
	private int y;

	Point(int a, int b) {x=a; y=b;}

	int getX() {return x;}
	int getY() {return y;}
	void setX(int n) {x = n;}
	void setY(int n) {y = n;}
}
