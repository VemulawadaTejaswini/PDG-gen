
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		List<Pair> list = new ArrayList<>();
		for(int i = 1; i < h + 1; i++) {
			for(int j = 1; j < w + 1; j++) {
				list.add(new Pair(sc.nextInt(), j, i));
			}
		}
		list.sort(Comparator.comparing(Pair::getNum));
		int[] x = new int[h * w + 1];
		int[] y = new int[h * w + 1];
		int[] sum = new int[h * w + 1];
		for(int i = 1; i < h * w + 1; i++) {
			x[i] = list.get(i - 1).getX();
			y[i] = list.get(i - 1).getY();
			if(i - d > 0) {
				sum[i] = sum[i - d] + Math.abs(x[i] - x[i - d]) + Math.abs(y[i] - y[i - d]);
			} else {
				sum[i] = 0;
			}
		}
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int ans = sum[r] - sum[l];
			System.out.println(ans);
		}
	}

}

class Pair {
	private int x;
	private int y;
	private int num;

	protected Pair(int num, int x, int y) {
		super();
		this.num = num;
		this.x = x;
		this.y = y;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}