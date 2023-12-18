
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Pair> p = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			p.add(new Pair(sc.nextInt(), i));
		}
		p.sort(Comparator.comparing(Pair::getNum).reversed());
		List<Pair> list = new ArrayList<>();
		list.add(new Pair(0, -1));
		list.add(new Pair(0, -1));
		list.add(new Pair(n + 1, n));
		list.add(new Pair(n + 1, n));
		long ans = 0;
		for(Pair e : p) {
			int pos = 0;
			for(int i = 0; i < list.size(); i++) {
				if(e.getPos() < list.get(i).getPos()) {
					pos = i;
					break;
				}
			}
			list.add(pos, e);
			ans += e.getNum() * (list.get(pos - 1).getPos() - list.get(pos - 2).getPos()) * (list.get(pos + 1).getPos() - e.getPos());
			ans += e.getNum() * (list.get(pos + 2).getPos() - list.get(pos + 1).getPos()) * (e.getPos() - list.get(pos - 1).getPos());
		}
		System.out.println(ans);

	}

}

class Pair {
	public int num;
	public int pos;

	protected Pair(int num, int pos) {
		super();
		this.num = num;
		this.pos = pos;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	@Override
	public String toString() {
		return "Pair [num=" + num + ", pos=" + pos + "]";
	}

}