import java.util.ArrayList;
import java.util.HashMap;
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
		int in;
		while ((in=s.nextInt())!=0) {
			int r=1145141919;
			for(int z=0;z*z*z<=in;z++) {
				int in2 = in-z*z*z;
				for(int y=0;y*y<=in2;y++) {
					int x=in2-y*y;
					r=Math.min(x+y+z,r);
				}
			}
			System.out.println(r);
		}
	}
}