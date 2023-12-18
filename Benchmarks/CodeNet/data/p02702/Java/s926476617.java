import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	static List<Integer> set = new CopyOnWriteArrayList<>();
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
				set.add(count);
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
		ExecutorService pool = Executors.newFixedThreadPool(8);
		while (i < 200000) {
			String tmp = "" + (2019l * ++i);
			pool.submit(new Count(tmp));
		}
		long sum = 0l;
		pool.shutdown();
		for (int num : set) {
			sum += num;
		}
		System.out.println(sum);
	}
}
