import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TreeSet<Record> gtop = new TreeSet<Record>();
		TreeSet<Record> otop = new TreeSet<Record>();
		for (int g = 0; g < 3; g++) {
			for (int t = 0; t < 8; t++) {
				gtop.add(new Record(in.nextInt(), in.nextDouble()));
			}
			for (int i = 0; i < 2; i++) {
				System.out.println(gtop.pollFirst());
			}
			otop.addAll(gtop);
			gtop.clear();
		}
		for (int i = 0; i < 2; i++) {
			System.out.println(otop.pollFirst());
		}
	}
}

class Record implements Comparable<Record> {
	final int num;
	final double time;

	public Record(int num, double time) {
		this.num = num;
		this.time = time;
	}

	@Override
	public int compareTo(Record other) {
		return Double.compare(this.time, other.time);
	}

	@Override
	public String toString() {
		return String.format("%d %.2f", num, time);
	}

}