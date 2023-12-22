import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	static Deque<Integer> mapStack;
	static Deque<Mizutamari> waterStack;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] graph = sc.nextLine().split("");
		sc.close();
		mapStack = new ArrayDeque<>();
		waterStack = new ArrayDeque<>();

		for (int i = 0; i < graph.length; i++) {
			switch (graph[i]) {
			case "\\":
				mapStack.offerLast(i);
				break;
			case "/":
				if (mapStack.isEmpty()) continue;
				int start = mapStack.pollLast();
				int tmpArea = i - start;
				while (!waterStack.isEmpty() && waterStack.peekLast().getStartIdx() > start) {
					tmpArea += waterStack.pollLast().getArea();
				}
				waterStack.offerLast(new Mizutamari(start, tmpArea));
				break;
			case "_":
				continue;
			}

		}

		System.out.println(waterStack.stream().map(m -> m.getArea()).reduce(0, (x, y) -> x + y));
		System.out.print(waterStack.size());
		int len = waterStack.size();
		for (int i = 0; i < len; i++) {
			System.out.print(" ");
			System.out.print(waterStack.pollFirst());
		}
	}

}

class Mizutamari {
	private int startIdx;
	private int area;
	public Mizutamari(int start, int area) {
		this.startIdx = start;
		this.area = area;
	}
	public int getStartIdx() {
		return startIdx;
	}
	public int getArea() {
		return area;
	}
	public void addArea(int area) {
		this.area += area;
	}

	@Override
	public String toString() {
		return String.valueOf(area);
	}
}