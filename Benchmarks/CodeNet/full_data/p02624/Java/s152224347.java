import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		sc.close();

		var d = new int[n + 1];
		for (var i = 1; i <= n; i++) {
			for (var j = i; j <= n; j+=i) {
				d[j]++;
			}
		}

		var sum = 0L;
		for (var i = 1; i <= n; i++) {
			sum += (long)i * d[i];
		}

		System.out.println(sum);
	}
}
