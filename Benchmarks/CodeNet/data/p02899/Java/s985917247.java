import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int N = scan.nextInt();

		H[] hs = new H[N];
		for(int i = 0; i < N; i++) {
			hs[i] = new H(i + 1, scan.nextInt());
		}

		Arrays.sort(hs, new Comparator<H>(){
			public int compare(H h1, H h2) {
				return h1.getOrder() - h2.getOrder();
			}
		});

		System.out.print(hs[0].getNum());
		for(int i = 1; i < N; i++) {
			System.out.print(" " + hs[i].getNum());
		}
		scan.close();
	}
}

class H{
	private int num;
	private int order;

	public H (int num, int order) {
		this.num = num;
		this.order = order;
	}

	public int getNum() {
		return this.num;
	}

	public int getOrder() {
		return this.order;
	}
}
