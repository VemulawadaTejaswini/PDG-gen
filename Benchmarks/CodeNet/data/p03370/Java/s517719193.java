import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		Integer[] intArray = Arrays.asList(sc.nextLine()
			.split(" "))
			.stream()
			.map(str -> Integer.parseInt(str))
			.toArray(Integer[]::new);
		int n = intArray[0];
		int m = intArray[1];
		long[] larray = new long[n];
		long sum = 0;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			larray[i] = sc.nextLong();
			sum += larray[i];
			cnt++;
			m -= larray[i];
		}
		Arrays.sort(larray);
		cnt += m / larray[0];
		System.out.println(cnt);
	}
}

