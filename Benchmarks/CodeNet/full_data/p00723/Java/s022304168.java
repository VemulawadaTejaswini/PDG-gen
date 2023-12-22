import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {
	static final Scanner s = new Scanner(System.in);

	static final long[] fal_rnd(int size, boolean parallel) {
		AtomicInteger l = new AtomicInteger(-1), r = new AtomicInteger(size);
		long[] res = new long[size];
		(parallel ? INS(size).parallel() : INS(size)).unordered().mapToLong(Long::parseLong).forEach(
				v -> res[ThreadLocalRandom.current().nextBoolean() ? l.incrementAndGet() : r.decrementAndGet()] = v);
		return res;
	}

	static final IntStream REPS(int v) {
		return IntStream.range(0, v);
	}

	static final Stream<String> INS(long size) {
		return StreamSupport
				.stream(Spliterators.spliterator(s, size, Spliterator.NONNULL & Spliterator.IMMUTABLE), false)
				.limit(size);
	}

	static HashMap<Integer, ArrayList<String>> map = new HashMap<>();

	public static void main(String __[]) {
		for (int n = s.nextInt(); n > 0; n--) {
			String in = s.next();
			HashSet<String> r=new HashSet<>(114514);
			for (int i = 1; i <= in.length(); i++) {
				String
				left=in.substring(0, i),
				right=in.substring(i, in.length()),
				lrev=String.valueOf(reverse(left.toCharArray())),
				rrev=String.valueOf(reverse(right.toCharArray()));
				r.add(left+right);
				r.add(right+left);

				r.add(left+rrev);
				r.add(right+lrev);

				r.add(lrev+right);
				r.add(rrev+left);

				r.add(lrev+rrev);
				r.add(rrev+lrev);
			}
			System.out.println(r.size());
		}
	}
	public static void swap(char[] l, int a, int b) {
		char x = l[b];
		l[b] = l[a];
		l[a] = x;
	}
	public static char[] reverse(char[] b) {
		for (int c = 0; c < b.length / 2; c++) {
			swap(b, c, b.length - 1 - c);
		}
		return b;
	}
}