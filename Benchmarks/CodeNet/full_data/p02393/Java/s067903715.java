import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		print();
	}

	private static void print() throws IOException {
		int a;
		int b;
		int c;

		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		sort(a, b, c);
	}

	private static void sort(int a, int b, int c) {
		// TODO ?????????????????????????????????????????????
		List<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);

		Collections.sort(list);
		System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
	}

}