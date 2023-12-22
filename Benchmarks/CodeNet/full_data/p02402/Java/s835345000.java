import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int array_size = sc.nextInt();

		long[] array = new long[array_size];

		for (int counta = 0; counta < array.length; counta++) {
			array[counta] = sc.nextLong();
		}

		sc.close();

		long min = array[0];
		long max = array[0];
		long sum = 0;

		for (int counta = 0; counta < array.length; counta++) {
			if (min > array[counta]) min = array[counta];
			if (max < array[counta]) max = array[counta];
			sum = sum + array[counta];
		}

		System.out.printf("%d %d %d\n", min, max, sum);
	}

}

