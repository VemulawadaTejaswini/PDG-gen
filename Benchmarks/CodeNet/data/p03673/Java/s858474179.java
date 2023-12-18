import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int[] a = new int[n];
		
		List<Integer> b = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		for(int i = 0; i < n; i++) {
			b.add(a[i]);
			
			Collections.reverse(b);
		}
		
		b.forEach(i -> System.out.print(i + " "));
	}
}
