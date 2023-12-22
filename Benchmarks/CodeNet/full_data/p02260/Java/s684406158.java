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
		
		int swap = selectionSort(input);
		System.out.println(format(input));
		System.out.println(swap);
	}
	
	static int selectionSort(int[] a) {
		int swap = 0;
		for (int i = 0; i < a.length; i++) {
			int minj = i; // i????????\?????§????°????????´????????????????????????????
			for (int j = i; j < a.length; j++) {
				if (a[minj] > a[j]) {
					minj = j;
				}
			}
			if (minj != i) {
				int tmp = a[i];
				a[i] = a[minj];
				a[minj] = tmp;
				swap++;
			}
		}
		return swap;
	}
	
	static String format(int[] a) {
		return IntStream.of(a).mapToObj(n -> String.valueOf(n)).collect(Collectors.joining(" "));
	}
}