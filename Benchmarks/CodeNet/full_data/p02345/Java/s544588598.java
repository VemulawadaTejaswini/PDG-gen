import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		RQ rq = new RQ(n, false);

		int q = scan.nextInt();
		for (int i = 0; i < q; i++)
			switch (scan.nextInt()) {
			case (0):
				rq.update(scan.nextInt(), scan.nextInt());
				break;
			case (1):
				System.out.println(rq.find(scan.nextInt(), scan.nextInt()));
				break;
			}

		scan.close();
		System.exit(0);
	}
}

class RQ {
	class ELEM {
		int parant;
		int front;
		int behind;
		int value;
	}

	ELEM[] elem;
	int root;
	boolean debug;

	public RQ(int n, boolean d) {
		debug = d;

		elem = new ELEM[n];
		int y = (int) (Math.pow(2, 31) - 1);
		for (int i = 0; i < n; i++) {
			elem[i] = new ELEM();
			elem[i].parant = i - 1;
			elem[i].front = -1;
			elem[i].behind = i + 1;
			elem[i].value = y;
		}
		elem[n - 1].behind = -1;
		root = 0;
	}

	public int find(int x1, int x2) {
		if (x1 == x2)
			return elem[x1].value;
		if (elem[x1].value > elem[x2].value)
			return find(elem[x1].parant, x2);
		else
			return find(x1, elem[x2].parant);
	}

	public void update(int x, int y) {
		elem[x].value = y;
		updown(x);
		if (debug) {
			System.out.println("---------------------");
			printAll(root);

		}
	}

	private void printAll(int p) {
		if (p < 0)
			return;
		printAll(elem[p].front);
		System.out.println("--- " + p + "\t" + elem[p].value);
		printAll(elem[p].behind);
	}

	private void updown(int x) {
		if (elem[x].front >= 0 && elem[elem[x].front].value < elem[x].value) {
			downfront(x, elem[x].front);
			updown(x);
		}
		if (elem[x].behind >= 0 && elem[elem[x].behind].value < elem[x].value) {
			downbehind(x, elem[x].behind);
			updown(x);
		}
		if (elem[x].parant >= 0 && elem[elem[x].parant].value > elem[x].value)
			if (elem[elem[x].parant].front == x) {
				downfront(elem[x].parant, x);
				updown(x);
			} else {
				downbehind(elem[x].parant, x);
				updown(x);
			}
	}

	private void downbehind(int x, int nx) {
		if (elem[x].parant >= 0)
			if (elem[elem[x].parant].front == x)
				elem[elem[x].parant].front = nx;
			else
				elem[elem[x].parant].behind = nx;
		else
			root = nx;
		elem[nx].parant = elem[x].parant;

		elem[x].behind = elem[nx].front;
		if (elem[x].behind >= 0)
			elem[elem[x].behind].parant = x;

		elem[x].parant = nx;
		elem[nx].front = x;
	}

	private void downfront(int x, int nx) {
		if (elem[x].parant >= 0)
			if (elem[elem[x].parant].front == x)
				elem[elem[x].parant].front = nx;
			else
				elem[elem[x].parant].behind = nx;
		else
			root = nx;
		elem[nx].parant = elem[x].parant;

		elem[x].front = elem[nx].behind;
		if (elem[x].front >= 0)
			elem[elem[x].front].parant = x;

		elem[x].parant = nx;
		elem[nx].behind = x;
	}

}