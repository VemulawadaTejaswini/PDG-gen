import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var s = sc.next();
		var chars = s.toCharArray();
		var numbers = IntStream.range(0, chars.length).map(i -> Integer.valueOf(chars[i] - '0')).toArray();
		sc.close();

		var count = 0L;
		var set = new long[2019];
		for (var i = 0; i < numbers.length; i++) {
			var newset = new long[2019];
			newset[numbers[i]]++;
			for (var j = 0; j < 2019; j++) {
				if (set[j] > 0) {
					var number = j * 10 + numbers[i];
					if (number >= 2019) {
						number = number % 2019;
					}
					if (number == 0) {
						count += set[j];
					} else {
						newset[number] += set[j];
					}
				}
			}
			set = newset;
		}

		System.out.println(count);
	}
}