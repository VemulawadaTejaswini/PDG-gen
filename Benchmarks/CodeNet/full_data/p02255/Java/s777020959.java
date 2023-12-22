import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];
		
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		
		System.out.println(format(input));
		
		for (int i = 1; i < input.length; i++) {
			int v = input[i];
			int j = i - 1;
			while (j >= 0 && input[j] > v) {
				input[j + 1] = input[j];
				j--;
			}
			input[j + 1] = v;
			System.out.println(format(input));
		}
	}
	
	public static String format(int[] a) {
		return IntStream.of(a).mapToObj(n -> String.valueOf(n)).collect(Collectors.joining(" "));
	}
}