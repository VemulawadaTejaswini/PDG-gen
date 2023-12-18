
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<city> list = new ArrayList<>();
		for(int i = 1; i < M + 1; i++) {
			list.add(new city(i, sc.nextInt(), sc.nextLong()));
		}
		int[] count = new int[N + 1];
		for(int i = 1; i < N + 1; i++) {
			count[i] = 1;
		}
		list.sort(Comparator.comparing(city::getYear));
		for(city e : list) {
			e.setOrder(count[e.getPre()]);
			count[e.getPre()]++;
		}
		list.sort(Comparator.comparing(city::getNum));
		for(city e : list) {
			System.out.println(e.getId());
		}
	}

}

class city {
	private int num;
	private int pre;
	private long year;
	private int order;

	protected city(int num, int pre, long year) {
		super();
		this.num = num;
		this.pre = pre;
		this.year = year;
	}

	public String getId() {
		String p = String.valueOf(this.pre);
		String q = String.valueOf(this.order);
		while(p.length() < 6) {
			p = "0" + p;
		}
		while(q.length() < 6) {
			q = "0" + q;
		}
		return p + q;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPre() {
		return pre;
	}

	public void setPre(int pre) {
		this.pre = pre;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

}
