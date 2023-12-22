import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] string = line.split(" ");
		int[] is = new int[string.length];
		for (int i = 0; i < is.length; i++) {
			is[i] = Integer.parseInt(string[i]);
		}

		int a = is[0];
		int b = is[1];
		int c = is[2];

		List<Integer> list = new ArrayList<Integer>();

		for (int i = a; i <= b; i++) {
			if (c % i == 0) {
				list.add(i);
			}
		}

		System.out.println(list.size());

	}

}