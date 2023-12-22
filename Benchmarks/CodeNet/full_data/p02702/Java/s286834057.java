import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
	static long res = 0l;
	static String str;
	
	static synchronized void add(int num) {
		res += num;
	}
	
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
				add(count);
			}
		}
		
		public Count(String s) {
			this.s = s;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		int i = 0;
		ExecutorService pool = Executors.newWorkStealingPool();
		while (i < 2500000) {
			String tmp = "" + (2019l * ++i);
			pool.submit(new Count(tmp));
		}
		pool.shutdown();
		pool.awaitTermination(300, TimeUnit.MILLISECONDS);
		pool.shutdownNow();
		System.out.println(res);
	}
}
