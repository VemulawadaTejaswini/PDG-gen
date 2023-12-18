import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 3; i++) {
			set.add(i + 1);
		}
		set.remove(a);
		set.remove(b);
		System.out.println(set.toArray()[0]);
	}
}
