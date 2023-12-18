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
		var set = new boolean[2019];
		set[0] = true;
		for (var i = 0; i < s.length(); i++) {
			var newset = new boolean[2019];
			newset[numbers[i]] = true;
			for (var j = 0; j < 2019; j++) {
				if (set[j]) {
					var number = j * 10 + numbers[i];
					if (number >= 2019) {
						number = number % 2019;
					}
					if (number == 0) {
						count++;
					}
					newset[number] = true;
				}
			}
			set = newset;
		}

		System.out.println(count);
	}
}