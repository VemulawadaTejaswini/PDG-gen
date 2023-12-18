import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static class Cake {
		public long x;
		public long y;
		public long z;

		public Cake(long x, long y, long z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public long getNextScore(long cx, long cy, long cz) {
			long nx = cx + x;
			long ny = cy + y;
			long nz = cz + z;
			long result = Math.abs(nx) + Math.abs(ny) + Math.abs(nz);
			return result;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int n = Integer.parseInt(tokens[0]);
		int m = Integer.parseInt(tokens[1]);
		List<Cake> cakes = new ArrayList<>(n);
		for (int i = 0; i < n; ++i) {
			tokens = in.nextLine().split(" ");
			long x = Long.parseLong(tokens[0]);
			long y = Long.parseLong(tokens[1]);
			long z = Long.parseLong(tokens[2]);
			cakes.add(new Cake(x, y, z));
		}

		long score = 0L;
		long cx = 0L;
		long cy = 0L;
		long cz = 0L;
		for (int i = 0; i < m; ++i) {
			long nScore = Long.MIN_VALUE;
			int selectIndex = -1;
			for (int j = 0; j < cakes.size(); ++j) {
				if (cakes.get(j).getNextScore(cx, cy, cz) > nScore) {
					selectIndex = j;
					nScore = cakes.get(j).getNextScore(cx, cy, cz);
				}
			}
			Cake selectCake = cakes.get(selectIndex);
			score = nScore;
			cx = cx + selectCake.x;
			cy = cy + selectCake.y;
			cz = cz + selectCake.z;
			cakes.remove(selectIndex);
		}
		System.out.println(score);

		in.close();
	}

}
