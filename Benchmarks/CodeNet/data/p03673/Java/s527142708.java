import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		List<Integer> b = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b.add(a[i]);
			Collections.reverse(b);
		}
		for(int i = 0 ; i < n ; i++) {
			if(i != n - 1) {
				System.out.print(b.get(i) + " ");
			} else {
				System.out.println(b.get(i));
			}
		}
	}
}
