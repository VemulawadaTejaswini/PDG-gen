import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
	static List<Integer> list = new CopyOnWriteArrayList<>();
	static String str;
	
	static class Count implements Runnable {
		String s;
		
		@Override
		public void run() {
			String copy = str;
			int index = copy.indexOf(s);
			int count = 0;
			while (index >= 0) {
				if (index < 0) {
					break;
				} else {
					++count;
					copy = copy.substring(index + 4);
				}
				index = copy.indexOf(s);
			}
			
			if (count > 0) {
				list.add(count);
			}
		}
		
		public Count(String s) {
			this.s = s;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		long count = 0l;
		int i = 0;
		ExecutorService pool = Executors.newWorkStealingPool();
		while (i < 3000000) {
			String tmp = "" + (2019l * ++i);
			pool.submit(new Count(tmp));
		}
		pool.shutdown();
		pool.awaitTermination(400, TimeUnit.MILLISECONDS);
		pool.shutdownNow();
		long sum = list.parallelStream().mapToInt(x -> x).sum();
		System.out.println(sum);
	}
}
