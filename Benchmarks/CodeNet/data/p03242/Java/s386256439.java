import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int N = sc.nextInt();
		map.put(111, 999);
		map.put(119, 991);
		map.put(199, 911);
		map.put(999, 111);
		map.put(991, 119);
		map.put(911, 199);
		map.put(919, 191);
		map.put(191, 919);

		System.out.println(map.get(N));
	}
}