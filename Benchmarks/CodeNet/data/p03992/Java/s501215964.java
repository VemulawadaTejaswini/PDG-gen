import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int result = 0;
		N = sc.nextInt();
		HashMap<Integer, Integer> pair = new HashMap();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < N - 1; i++) {
			if (pair.get(i) == null) {
				
			for (int j = i + 1; j < N; j++) {
					if (i + 1 == a[j]) {
						result += 1;
						pair.put(i, j);
					}
				} 
			}
		}
		System.out.println(result);
	}
}
