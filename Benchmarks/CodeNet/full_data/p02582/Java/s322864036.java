import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var s = sc.next();
		sc.close();

		var max = 0;
		var count = 0;
		for (var i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("R")) {
				count++;
				max = Math.max(max, count);
			} else {
				count = 0;
			}

		}

		System.out.println(max);
	}
}
