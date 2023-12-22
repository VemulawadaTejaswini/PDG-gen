import java.util.Comparator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	static final Pattern pt = Pattern.compile("0?(\\d+):0?(\\d+):0?(\\d+)");
	static final Matcher mc = pt.matcher("");

	public static void main(String[] arg) {
		final Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) != 0) {
			SortedSet<Train> startset = new TreeSet<Train>(
					new Comparator<Train>() {
						@Override
						public int compare(Train o1, Train o2) {
							return o1.t1 - o2.t1;
						}
					});
			SortedSet<Train> moveset = new TreeSet<Train>(
					new Comparator<Train>() {
						@Override
						public int compare(Train o1, Train o2) {
							return o1.t2 - o2.t2;
						}
					});

			while (n-- > 0) {
				Train train = new Train(getTime(in), getTime(in));
				startset.add(train);
			}
			int time = 0;
			int stock = 0;
			int count = 0;

			for (Train t : startset) {
				time = t.t1;
				while (!moveset.isEmpty() && moveset.first().t2 <= time) {
					stock++;
					moveset.remove(moveset.first());
				}
				if (stock == 0) {
					stock++;
					count++;
				}
				moveset.add(t);
				stock--;
			}
			System.out.println(count);

		}
		in.close();
	}

	private static int getTime(Scanner in) {
		int time;
		mc.reset(in.next());
		mc.matches();
		time = Integer.parseInt(mc.group(3));
		time += Integer.parseInt(mc.group(2)) * 60;
		time += Integer.parseInt(mc.group(1)) * 3600;
		return time;
	}
}

class Train {
	final int t1, t2;

	Train(int t1, int t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
}