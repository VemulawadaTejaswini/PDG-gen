import java.io.*;
import java.util.*;

public class Main {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		double n = in.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i)
			list.add(in.nextInt());
		Collections.reverse(list);
		for (int i = 0; i < n; ++i) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(list.get(i));
		}
		System.out.println();
	}
}