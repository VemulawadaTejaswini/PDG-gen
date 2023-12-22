import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    List<Pair> pairList = new ArrayList<Pair>();

		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			Pair pa = new Pair(x, y);

			pairList.add(pa);
		}

	    Comparator<Pair> comparator = Comparator.comparing(Pair::getX)
	    		.thenComparing(Pair::getY);

	    Collections.sort(pairList, comparator);

	    for(int i = 0; i < n; i++) {
	    		System.out.println(pairList.get(i).getX() + " " + pairList.get(i).getY());
	    }

	}
}

class Pair {
	private int x;
	private int y;

	Pair(int a, int b) {
		this.x = a;
		this.y = b;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
}

