import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int m = scanner.nextInt();
			list.add(m);
			X -= m;
		}
 
		Collections.sort(list);
		int min = list.get(0);
		for (int x = 0; x <= X/min; x++) {
			count = x;
			if (min * x > X) {
				break;
			}
		}
		count += N;
		System.out.println(count);
	}
}