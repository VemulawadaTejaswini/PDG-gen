import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var x = sc.nextInt();
		sc.close();

		var a = 0;
		var b = 0;
		for (var i = 0; i <= 100; i++) {
			for (var j = -100; j <= 100; j++) {
				var value = (long)Math.pow(i, 5) - (long)Math.pow(j, 5);
				if (value == x) {
					a = i;
					b = j;
					break;
				};
			}
		}

		System.out.println(String.format("%d %d", a, b));
	}
}