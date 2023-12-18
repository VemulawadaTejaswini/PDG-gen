import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		new Main().run();
	}

	public void run() {
		final Scanner scanner = new Scanner(System.in);
		final int counter = scanner.nextInt();
		scanner.nextLine();
		final char[] charSequence = scanner.nextLine().toCharArray();

		final Map<Integer, MyInteger> wordCount = new HashMap<>();
		for (int index = 0; index < counter; index++) {
			wordCount.computeIfAbsent(Integer.valueOf(charSequence[index]%26), e -> new MyInteger()).increment();
		}

		final List<MyInteger> longs = new ArrayList<>(wordCount.values());
		
		long answer = 1;
		for(MyInteger value:longs) {
			answer *= value.getValue() + 1;
		}
		
		System.out.println(--answer%(1000000000+7));

		scanner.close();

	}

	class MyInteger {
		private long value;

		public MyInteger() {
			this.value = 0;
		}

		public void increment() {
			this.value++;
		}

		public long getValue() {
			return this.value;
		}
	}

}