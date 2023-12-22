import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			Set<Long> treeSet = new TreeSet<Long>();
			for (int i=0; i<n; i++) {
				 treeSet.add(sc.nextLong());
			}
			Long[] array = new Long[treeSet.size()];
			treeSet.toArray(array);
			for (int i=0; i<array.length - 1; i++) System.out.print(array[i] + " ");
			System.out.println(array[array.length - 1]);
		}
	}
}
