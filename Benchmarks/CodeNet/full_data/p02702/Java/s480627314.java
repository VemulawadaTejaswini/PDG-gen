import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var s = sc.next();
		var chars = s.toCharArray();
		var numbers = IntStream.range(0, chars.length).map(i -> Integer.valueOf(chars[i] - '0')).toArray();
		sc.close();

		var count = 0;
		var set = new HashSet<Integer>();
		set.add(0);
		for (var i = 0; i < s.length(); i++) {
			var newset = new HashSet<Integer>();
			newset.add(numbers[i]);
			for (var number : set) {
				number = number * 10 + numbers[i];
				if (number > 2019) {
					number = number % 2019;
				}
				if (number == 0) {
					count++;
				}
				newset.add(number);
			}
			set = newset;
		}

		System.out.println(count);
	}
}