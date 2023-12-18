
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() - 1;
		Pair[] edge = new Pair[n];
		int[] color = new int[n];
		for(int i = 0; i < n; i++) {
			color[i] = i;
		}
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			edge[i] = new Pair(a, b);
		}
		for(int i = 0; i < n; i++) {
			int a = edge[i].getOne();
			int b = edge[i].getTwo();
			for(int j = i + 1; j < n; j++) {
				int tmpa = edge[j].getOne();
				int tmpb = edge[j].getTwo();
				if(a != tmpa && a != tmpb && b != tmpa && b != tmpb && color[i] < color[j])
					color[j] = color[i];
			}
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
			ans = Math.max(ans, color[i]);
		}
		System.out.println(ans);
		for(int i = 0; i < n; i++) {
			System.out.println(color[i]);
		}
	}

}

class Pair {
	public int one;
	public int two;

	protected Pair(int one, int two) {
		super();
		this.one = one;
		this.two = two;
	}

	public int getOne() {
		return one;
	}

	public void setOne(int one) {
		this.one = one;
	}

	public int getTwo() {
		return two;
	}

	public void setTwo(int two) {
		this.two = two;
	}

}