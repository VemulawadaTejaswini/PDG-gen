import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(line);
		String[] k = new String[v];
		int[] va = new int[v];
		List<Integer> klist = new ArrayList<Integer>();
		for (int i = 0; i < k.length; i++) {
			k[i] = sc.nextLine();
			va[i] = Integer.parseInt(k[i]);
			klist.add(va[i]);
		}

		java.util.Collections.sort(klist);
		java.util.Collections.sort(klist);
		int val = 0;
		for (Integer integer : klist) {
			System.out.print(integer);
			if (val != v - 1) {
				System.out.print(" ");
			}
			val++;
		}
		System.out.println("");
	}
}