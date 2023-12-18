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
		long s;
		
		@Override
		public void run() {
			String copy = str;
			String tmp = String.valueOf(s);
			int index = copy.indexOf(tmp);
			int count = 0;
			while (index >= 0) {
				if (index < 0) {
					break;
				} else {
					++count;
					copy = copy.substring(index + 4);
				}
				index = copy.indexOf(tmp);
			}
			
			if (count > 0) {
				add(count);
			}
		}
		
		public Count(long s) {
			this.s = s;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		long i = 0l;
		ExecutorService pool = Executors.newWorkStealingPool();
		while (i < 5000000) {
			pool.submit(new Count(2019l * ++i));
		}
		pool.awaitTermination(350, TimeUnit.MILLISECONDS);
		System.out.println(res);
	}
}
