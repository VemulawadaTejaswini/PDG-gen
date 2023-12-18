
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static int N, M, KEYSIZE, TOP, ENTRYPRE;
	static TreeMap<Dataa, Integer> map = new TreeMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int pre = sc.nextInt();
			int year = sc.nextInt();
			map.put(new Dataa(pre, year), ++KEYSIZE);
		}
		Dataa tempDa = null;

		for (Map.Entry<Dataa, Integer> entry : map.entrySet()) {
			tempDa = entry.getKey();
			int tempPre = tempDa.getPre();
			if (ENTRYPRE != tempPre) {
				TOP = 0;
				ENTRYPRE = tempPre;
			}
			tempDa.setYear(++TOP);
		}
		Comparator<Map.Entry<Dataa, Integer>> valueComparator = new Comparator<Map.Entry<Dataa, Integer>>() {
			public int compare(Entry<Dataa, Integer> o1, Entry<Dataa, Integer> o2) {
				return o1.getValue() - o2.getValue();
			}
		};
		List<Map.Entry<Dataa, Integer>> list = new ArrayList<Map.Entry<Dataa, Integer>>(map.entrySet());
		Collections.sort(list, valueComparator);
		for (Map.Entry<Dataa, Integer> entry : list) {

			System.out.println(forMatSize("" + entry.getKey().getPre()) + forMatSize("" + entry.getKey().getYear()));
		}

	}

	public static String forMatSize(String str) {
		int len = ("" + str).length();
		for (int i = 0; i < 6 - len; i++) {
			str = "0" + str;
		}
		return str;
	}

}

class Dataa implements Comparable<Dataa> {

	private int pre;
	private int year;

	public Dataa(int pre, int year) {
		super();
		this.pre = pre;
		this.year = year;
	}

	public int getPre() {
		return pre;
	}

	public void setPre(int pre) {
		this.pre = pre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int compareTo(Dataa o) {
		// System.out.println("===");
		int val = this.pre - o.pre;
		if (val != 0) {
			return val;
		} else {
			return this.year - o.year;
		}
	}

	@Override
	public String toString() {
		return this.pre + "-" + this.year;
	}

	public int hashCode() {
		return this.year * 100;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)// 自己和自己比较
			return true;// 那就是同一个相等了
		// 传入的引用不为空，而且两个的类型一样
		if (obj != null && obj.getClass() == this.getClass()) {
			Dataa da = (Dataa) obj;// 类型转换
			return this.year == da.year;
			// 如果两个的编号一样，那就认为相等
		}
		return false;
	}
}