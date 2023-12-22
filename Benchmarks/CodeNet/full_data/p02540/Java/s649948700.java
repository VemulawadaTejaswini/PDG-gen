import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		Point p[] = new Point[N];
		Main main = new Main();
		Map map = new HashMap<>();
		for (int i=0;i<N;i++) {
			Point t = main.new Point();
			t.x= sc.nextInt();
			t.y= sc.nextInt();
			t.num= i;
			p[i] = t;
		}
		Arrays.sort(p,Collections.reverseOrder());
		for (int i=0;i<N;i++) {
			int count =1;
			if (A[p[i].num]==0) {
				for (int j=i+1;j<N;j++) {
					if (p[i].y>p[j].y) {
						count ++;
						A[p[j].num]=i+1;
					}
				}
				map.put(i+1, count);
				A[p[i].num]=i+1;
			}
		}

		for (int i=0;i<N;i++) {
			System.out.println(map.get(A[i]));
		}
	}

	public class Point implements Comparable {
		int x;
		int y;
		int num;
		@Override
		public int compareTo(Object o) {
			Point p = (Point)o;
			if (this.x>p.x) {
				return 1;
			}
			return -1;
		}

	}
}