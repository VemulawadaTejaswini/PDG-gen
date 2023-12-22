
import java.util.*;
import java.lang.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	int MAX = 10005;
	void run() {
		Scanner sc = new Scanner(System.in);
		int[][] area = new int[MAX][MAX];
		for(;;) {
			int n = sc.nextInt(), r = sc.nextInt();
			if ((n|r) == 0) break;
			for (int[] a: area) fill(a, 0);
			for (int i=0;i<n;i++) {
				int x1 = sc.nextInt()+1, y1 = sc.nextInt()+1, x2 = sc.nextInt()+1, y2 = sc.nextInt()+1;
				area[y1][x1]++; area[y2][x1]--;
				area[y1][x2]--; area[y2][x2]++;
			}
			for (int y=1;y<MAX;y++) for (int x=1;x<MAX;x++) {
				area[y][x] += area[y][x-1];
			}
			for (int y=1;y<MAX;y++) for (int x=1;x<MAX;x++) {
				area[x][y] += area[x-1][y];
			}
//			for (int[] a:area) debug(a);
			int a = 0, l = 0;
			for (int y=1;y<MAX;y++) for (int x=1;x<MAX;x++) {
				if (area[y][x] > 0) a++;
				if (((area[y][x] | area[y-1][x]) != 0 ) && area[y][x] * area[y-1][x] == 0) l++;
				if (((area[y][x] | area[y][x-1]) != 0 ) && area[y][x] * area[y][x-1] == 0) l++;
			}
			System.out.println(a);
			if (r == 2) System.out.println(l);
		}
	}
	
	void debug(Object... os) {
		System.out.println(deepToString(os));
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		new Main().run();
	}
}