import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<String> sl = Arrays.asList(br.readLine().trim().split(" "));
		List<Integer> il = new ArrayList<>();
		for (String s : sl) {
			il.add(Integer.parseInt(s));
		}

		insertionSort(il, n);
	}

	static void insertionSort(List<Integer> l, int n) {
		printList(l);
		for (int i=1; i<n; i++) {
			int v = l.get(i);
			int j = i - 1;
			while (j >= 0 && l.get(j) > v) {
				l.set(j + 1, l.get(j));
				j--;
			}
			l.set(j + 1, v);
			printList(l);
		}
	}
	
	static void printList(List<Integer> l) {
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
			if (it.hasNext()) System.out.print(" ");
		}
		
		System.out.println();
	}
}