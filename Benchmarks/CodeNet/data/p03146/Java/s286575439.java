import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();

		int cnt =0;
		Map<Integer,Integer> map = new HashMap<>();

		int n = s;
		map.put(0, s);
		for (int i = 1; i < 1000000; i++) {

			if (n%2 == 0) {
				n = n/2;
				if (map.containsValue(n)){
					cnt = map.size()+1;
					break;
				}
				map.put(i, n);
			} else {
				n = 3*n +1;
				if (map.containsValue(n)){
					cnt = map.size()+1;
					break;
				}
				map.put(i, n);
			}
		}

		System.out.println(cnt);

	}

}
