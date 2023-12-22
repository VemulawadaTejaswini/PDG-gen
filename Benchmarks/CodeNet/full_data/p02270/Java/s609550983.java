import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

// ALDS1_4_D
public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> alis = new ArrayList<Integer>();
		LinkedList<Integer> llis = new LinkedList<Integer>();
		for (int i = 0; i < k; i++) {
			llis.add(0);
		}
		for (int i = 0; i < n; i++) {
			alis.add(sc.nextInt());
		}
		Collections.sort(alis);
		for (int i = n - 1; i > -1; i--) {
			llis.add(llis.get(0) + alis.get(i));
			llis.remove(0);
			Collections.sort(llis);
		}
		System.out.println(llis.get(llis.size() - 1));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}

