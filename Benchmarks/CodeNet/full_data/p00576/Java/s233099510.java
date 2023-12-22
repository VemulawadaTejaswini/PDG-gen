import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 1; i <= A; i++) {
			int B = sc.nextInt();
			map.put(String.valueOf(i), B);
		}
		int C = sc.nextInt();
		for (int l = 0; l < C; l++) {
			int D = sc.nextInt();
			int beforeChangeNumber = map.get(String.valueOf(D));
			if (D != A) {
				int afterChangeNumber = map.get(String.valueOf(D + 1));
				if (afterChangeNumber != (beforeChangeNumber + 1) && beforeChangeNumber != 2019) {
					map.put(String.valueOf(D), beforeChangeNumber + 1);
				}
			} else if(beforeChangeNumber != 2019) {
				map.put(String.valueOf(D), beforeChangeNumber + 1);
			}
		}
		for (int i = 1; i <= A; i++) {
			System.out.println(map.get(String.valueOf(i)));
		}

	}

}

