import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] data = new int[10];
		for (int i = 0; i < data.length; i++)
			data[i] = sc.nextInt();

		Arrays.sort(data);
		System.out.println(data[data.length - 1]);
		System.out.println(data[data.length - 2]);
		System.out.println(data[data.length - 3]);

	}

}