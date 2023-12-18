
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		List<city> list = new ArrayList<>();
		for(long i = 1; i < M + 1; i++) {
			list.add(new city(i, sc.nextLong(), sc.nextLong()));
		}
		long[] count = new long[(int) N + 1];
		for(int i = 1; i < N + 1; i++) {
			count[i] = 1;
		}
		list.sort(Comparator.comparing(city::getYear));
		for(city e : list) {
			e.setOrder(count[(int) e.getPre()]);
			count[(int) e.getPre()]++;
		}
		list.sort(Comparator.comparing(city::getNum));
		for(city e : list) {
			System.out.println(e.getId());
		}
	}

}

class city {
	private long num;
	private long pre;
	private long year;
	private long order;

	protected city(long num, long pre, long year) {
		super();
		this.num = num;
		this.pre = pre;
		this.year = year;
	}

	public String getId() {
		String p = String.valueOf(this.pre);
		String q = String.valueOf(this.order);
		while(p.length() >= 6) {
			p = "0" + p;
		}
		while(q.length() >= 6) {
			p = "0" + q;
		}
		return p + q;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public long getPre() {
		return pre;
	}

	public void setPre(long pre) {
		this.pre = pre;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public long getOrder() {
		return order;
	}

	public void setOrder(long order) {
		this.order = order;
	}

}
