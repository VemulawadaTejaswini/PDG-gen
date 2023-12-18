import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		TreeSet<Integer> tree = new TreeSet<Integer> ();
		int N, M;
		long sum = 0;
		N = sc.nextInt ();
		M = sc.nextInt ();
		for (int i=0; i<N; i++) {
			int tmp = sc.nextInt ();
			tree.add ((Integer)tmp);
			sum += (long)tmp;
		}
		for (int i=0; i<M; i++) {
			int a = tree.last ();
			tree.remove (tree.last ());
			sum -= a/2+a%2;
			tree.add ((Integer)(a/2));
		}
		System.out.println (sum);
	}
}