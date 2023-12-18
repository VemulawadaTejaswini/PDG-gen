import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		TreeMap<Integer, Integer> a = new TreeMap<>();
		
		for(int i =1; i <= n; i++) {
			a.put(i, 0);
		}
		
		for(int i = 0; i < n - 1; i++) {
			int key = sc.nextInt();
			a.put(key,a.get(key)+1);
		}

		for (Integer key : a.keySet()) {
			System.out.println(a.get(key));
		}

	}
}
