import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();

		int[] a = new int[N];
		int i = 0, index1 = -1;
		boolean found = true;
		while (N-- > 0) {
			a[i++] = sc.nextInt();
			if (found && a[i - 1] == 1) {
				found = false;
				index1 = i;
			}
		}
		Set<Integer> s = new LinkedHashSet<Integer>();

		i = 0;

		while (!s.contains(i)) {
			s.add(i);
			//System.out.print(a[i]);
			i = (a[i] - 1) % a.length;
			//System.out.print(" " + a[i] + "\n");
			//System.out.println("	: Set :" + s);
		}
		int breakIndex = i;
		
		int rem = (int) (K % s.size()) - 1;
		//System.out.println("rem : " + rem);
		Iterator<Integer> itr = s.iterator();
		int value = -1;
		for (i = 0 - breakIndex; itr.hasNext(); i++) {
			value = itr.next();
			if (i == rem) {
				break;
			}
		}
		//System.out.print(i + " " + a[i] + "\n");
		System.out.println(a[value]);
	}

}
