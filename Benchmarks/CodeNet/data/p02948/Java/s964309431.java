
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		boolean[] flag = new boolean[n];
		for(int i = 0; i < n; i++) {
			flag[i] = true;
		}
		for(int i = 0; i < n; i++) {
			a[i] = m - sc.nextInt();
			b[i] = sc.nextInt();
		}
		long ans = 0;
		for(int i = m - 1; i > -1; i--) {
			int max = 0;
			int sel = n;
			for(int j = 0; j < n; j++) {
				if(flag[j] && (a[j] >= i) && max < b[j]) {
					sel = j;
					max = b[j];
				}
			}
			if(sel != n) {
				flag[sel] = false;
				ans += max;
			}
		}
		System.out.println(ans);

	}

}

class Work {
	private int a;
	private int b;

	protected Work(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}