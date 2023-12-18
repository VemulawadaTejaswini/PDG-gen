import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		sc.close();

		Collections.sort(a);

		int minIndex;

		while(getSameCardIndex(a) != -1) {

			minIndex = getSameCardIndex(a);

			if(a.size() == minIndex + 2) {
				minIndex--;
			}

			a.remove(minIndex);
			a.remove(minIndex + 1);

		}

		System.out.println(a.size());

	}

	private static int getSameCardIndex(ArrayList<Integer> a) {
		int prev = a.get(0);
		for(int i = 1; i < a.size(); i++) {
			if(a.get(i).equals(prev)) {
				return i - 1;
			}
			prev = a.get(i);
		}
		return -1;
	}

}
