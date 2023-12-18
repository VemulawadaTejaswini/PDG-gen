
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static int h, n;
	public static List<Pair> list = new ArrayList<>();
	public static long min = Long.MAX_VALUE;

	public static void Calc(int pos, int hp, int magic) {
		int loop = (hp + list.get(pos).getA() - 1) / list.get(pos).getA();
		if(loop < 0)
			loop = 0;
		if(pos < n - 1) {
			for(int i = 0; i < loop + 1; i++) {
				Calc(pos + 1, hp - list.get(pos).getA() * i, magic + list.get(pos).getB() * i);
			}
		} else {
			min = Math.min(min, magic + loop * list.get(pos).getB());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			list.add(new Pair(sc.nextInt(), sc.nextInt()));
		}
		list.sort(Comparator.comparing(Pair::getCP));
		Calc(0, h, 0);
		System.out.println(min);
	}

}

class Pair {
	private int a;
	private int b;

	protected Pair(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getCP() {
		return (double) a / (double) b;
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