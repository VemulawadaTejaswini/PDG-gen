import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();

		for (int i=1; i<n; i++){
			int a = sc.nextInt();
			if (map.containsKey(a)){
				map.put(a, map.get(a)+1);
			} else {
				map.put(a, 1);
			}
		}

		for (int i=1; i<=n; i++){
			if (map.containsKey(i)){
				System.out.println(map.get(i));
			} else {
				System.out.println("0");
			}
		}
	}
}