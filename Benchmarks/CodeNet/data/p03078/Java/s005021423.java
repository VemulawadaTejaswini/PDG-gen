import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		int Z = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		long[] A = nextLongArray(sc, X);
		long[] B = nextLongArray(sc, Y);
		long[] C = nextLongArray(sc, Z);
		boolean[][][] d = new boolean[X][Y][Z];
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		int ix = A.length - 1;
		int iy = B.length - 1;
		int iz = C.length - 1;

		// 最大値を表示
		System.out.println(A[ix] + B[iy] + C[iz]);
		K--;

		List<Point> list = new ArrayList<>();
		while(K > 0) {
			int cx = ix - 1;
			int cy = iy - 1;
			int cz = iz - 1;
			if(cx >= 0 && !d[cx][iy][iz]) {
				list.add(new Point(cx, iy, iz, A[cx] + B[iy] + C[iz]));
				d[cx][iy][iz] = true;
			}
			if(cy >= 0 && !d[ix][cy][iz]) {
				list.add(new Point(ix, cy, iz, A[ix] + B[cy] + C[iz]));
				d[ix][cy][iz] = true;
			}
			if(cz >= 0 && !d[ix][iy][cz]) {
				list.add(new Point(ix, iy, cz, A[ix] + B[iy] + C[cz]));
				d[ix][iy][cz] = true;
			}
			if (!list.isEmpty()) {
				Collections.sort(list);
				Point point = list.get(list.size() - 1);
				list.remove(list.size() - 1);
				System.out.println(point.value);
				ix = point.x;
				iy = point.y;
				iz = point.z;
			}
			K--;
		}

	}

	private static long[] nextLongArray(Scanner sc, int x) {
		long[] array = new long[x];
		for (int i = 0; i < array.length; i++) {
			array[i] = Long.parseLong(sc.next());
		}
		return array;
	}


}

class Point implements Comparable<Point> {
	public Point(int x, int y, int z, long l) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.value = l;
	}
	int x;
	int y;
	int z;
	long value;
	@Override
	public int compareTo(Point o) {
		if (value > o.value) {
			return 1;
		} else if (value == o.value) {
			return 0;
		}
		return -1;
	}

}
