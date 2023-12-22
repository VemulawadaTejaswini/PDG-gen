import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int n;
		while ((n = sc.nextInt()) != 0) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			int Sum = 0;
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
				Sum += list.getLast();
			}
			Sum-=Collections.max(list);
			Sum-=Collections.min(list);
			int t = Sum / (list.size()-2);
			pw.printf("%d\n", t);
		}
		pw.close();
		sc.close();
	}
}