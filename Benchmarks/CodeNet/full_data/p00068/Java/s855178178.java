import java.util.Scanner;

public class Main {
	static class Vertex {
		double x, y;

		public Vertex(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public String toString() {
			return "{" + this.x + " " + this.y + "}";
		}

		public boolean isLeft(Vertex p, Vertex q) {
			if (0 < (q.x - p.x) * (this.y - p.y) - (this.x - p.x) * (q.y - p.y)) {
				return true;
			}else {
				return false;
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		Vertex v[];
		Vertex hull[];

		n = sc.nextInt();
		while (n != 0) {
			v = new Vertex[n];
			for (int i = 0; i < n; i++) {
				String s[] = sc.next().split(",");
				v[i] = new Vertex(Double.valueOf(s[0]), Double.valueOf(s[1]));
			}

			sort(v, 0, n - 1);
			hull = makeHull(v, 0, n - 1);

			System.out.println(v.length - hull.length);

			n = sc.nextInt();
		}
	}

	public static void sort(Vertex v[], int low, int high) {
		if (high <= low) {
			return ;
		}
		int i = low;
		int j = high;
		double x = v[(low + high) / 2].x;
		while (i <= j) {
			while (v[i].x < x) {
				i++;
			}
			while (x < v[j].x) {
				j--;
			}
			if (i <= j) {
				Vertex swap = new Vertex(v[i].x, v[i].y);
				v[i] = v[j];
				v[j] = swap;
				i++;
				j--;
			}
		}
		sort(v, low, j);
		sort(v, i, high);
	}

	public static Vertex[] makeHull(Vertex v[], int low, int high) {
		if (high - low == 0) {
			Vertex v1[] = new Vertex[1];
			v1[0] = v[low];
			return v1;
		} else if (high - low == 1) {
			Vertex v1[] = new Vertex[2];
			v1[0] = v[low];
			v1[1] = v[high];
			return v1;
		} else {
			Vertex left[];
			Vertex right[];
			Vertex v1[];
			left = makeHull(v, low, (low + high) / 2);
			right = makeHull(v, (low + high) / 2 + 1, high);
			v1 = combineHull(left, right);
			return v1;
		}
	}

	public static Vertex[] combineHull(Vertex left[], Vertex right[]) {
		Vertex hull[];
		int topIndex[];
		int bottomIndex[];

		topIndex = seachTopIndex(left, right);
		bottomIndex = seachBottomIndex(left, right);

		int k_left = (bottomIndex[0] - topIndex[0] + left.length) % left.length + 1;
		int k_right = (topIndex[1] - bottomIndex[1] + right.length) % right.length + 1;
		hull = new Vertex[k_left + k_right];
		int index = 0;
		while (true) {
			if (0 <= index && index < k_left) {
				hull[index] = left[(topIndex[0] + index) % left.length];
				index++;
			} else if (k_left <= index && index < k_left + k_right) {
				hull[index] = right[(bottomIndex[1] + index - k_left) % right.length];
				index++;
			} else {
				break;
			}
		}
		return hull;
	}

	public static int[] seachTopIndex(Vertex left[], Vertex right[]) {
		int i = seachMostRightIndex(left);
		int j = seachMostLeftIndex(right);

		while (true) {
			int i1 = (i + 1) % left.length;
			int j1 = (j - 1 + right.length) % right.length;
			if (left[i1].isLeft(left[i], right[j])) {
				i = i1;
			} else if (right[j1].isLeft(left[i], right[j])) {
				j = j1;
			} else {
				break;
			}
		}

		int index[] = {i, j};
		return index;
	}

	public static int[] seachBottomIndex(Vertex left[], Vertex right[]) {
		int i = seachMostRightIndex(left);
		int j = seachMostLeftIndex(right);

		while (true) {
			int i1 = (i - 1 + left.length) % left.length;
			int j1 = (j + 1) % right.length;
			if (left[i1].isLeft(right[j], left[i])) {
				i = i1;
			} else if (right[j1].isLeft(right[j], left[i])) {
				j = j1;
			} else {
				break;
			}
		}

		int index[] = {i, j};
		return index;
	}

	public static int seachMostRightIndex(Vertex v[]) {
		int max = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[max].x < v[i].x) {
				max = i;
			}
		}
		return max;
	}

	public static int seachMostLeftIndex(Vertex v[]) {
		int min = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i].x < v[min].x) {
				min = i;
			}
		}
		return min;
	}
}