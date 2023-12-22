import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int count = 0;
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int p = kb.nextInt();
			a.add(p);
		}
		Collections.sort(a);
		for (int i = 0; i < k; i++) {
			count += a.get(i);
		}

		System.out.println(count);

		kb.close();
	}

}
