import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var s = sc.next();
		sc.close();

		var chars = s.toCharArray();
		var rcount = IntStream.range(0, chars.length).filter(i -> chars[i] == 'R').count();
		var gcount = IntStream.range(0, chars.length).filter(i -> chars[i] == 'G').count();
		var bcount = IntStream.range(0, chars.length).filter(i -> chars[i] == 'B').count();
		var sum = rcount * gcount * bcount;
		for (var i = 0; i < n - 2; i++) {
			var char1 = chars[i];
			for (var j = i + 1; j < n - 1; j++) {
				var char2 = chars[j];
				if (char1 != char2) {
					var k = j + (j - i);
					if (k < n) {
						var char3 = chars[k];
						if (char1 != char3 && char2 != char3) {
							sum--;
						}
					}
				}
			}
		}

		System.out.println(sum);
	}
}