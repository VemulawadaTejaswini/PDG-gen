import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		atcode();
	}

	public static void atcode() {
		String[] info = new Scanner(System.in).nextLine().split(" ");
		int max = Integer.parseInt(info[0]);
		int sMin = Integer.parseInt(info[1]);
		int sMax = Integer.parseInt(info[2]);
		Long sum=0l;
		for (Integer i = 1; i <= max; i++) {
			Integer s = Arrays.asList(i.toString().split(""))
					.stream()
					.mapToInt(Integer::parseInt)
					.sum();
			if (s >= sMin && s <= sMax)
				sum+=i.longValue();
		}
		System.out.println(sum);
	}
}