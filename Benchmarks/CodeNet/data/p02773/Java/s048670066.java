import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
	static class Pair {
		String word;
		int count;
		public Pair(Map.Entry<String, List<String>> e) {
			word = e.getKey();
			count = e.getValue().size();
        }
		public int getCount() {return count;}
		public String getWord() {return word;}
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		Stream.generate(sc::next)
			.limit(n)
			.collect(Collectors.groupingBy(Function.identity()))
			.entrySet().stream().map(Pair::new)
			.collect(Collectors.groupingBy(Pair::getCount))
			.entrySet().stream()
			.max(Map.Entry.comparingByKey())
			.map(Map.Entry::getValue)
			.get()
			.stream()
			.map(Pair::getWord).sorted()
			.forEach(System.out::println);
	}
}