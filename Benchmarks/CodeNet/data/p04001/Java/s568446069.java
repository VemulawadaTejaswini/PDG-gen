import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] input = Arrays.stream(scanner.next().split("")).mapToInt(Integer::parseInt).toArray();
		int[] mask = new int[input.length - 1];
		for(int i = 0 ; i < mask.length; i++) mask[i] = (int)Math.pow(2, i);
		long subT = 0;
		long total = 0;
		for(int i = 0; i < (int)Math.pow(2, input.length -1); i++) {
			subT = input[0];
			for(int j = 0; j < mask.length; j++) {
				if((mask[j] & i) > 0) {
					total += subT;
					subT = input[j + 1];
				} else {
					subT *= 10;
					subT += input[j + 1];
				}
			}
			total += subT;
		}
		System.out.println(total);
	}
}
