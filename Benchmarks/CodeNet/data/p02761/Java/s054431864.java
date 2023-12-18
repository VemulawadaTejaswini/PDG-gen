import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		int a = 0;
		int b = 0;

		Map<Integer, Integer> map = new HashMap<Integer,Integer>();


		for(int i = 0; i < m; i++) {

			String[] tmp = scanner.nextLine().split(" ");
			a = Integer.parseInt(tmp[0]);
			b = Integer.parseInt(tmp[1]);
			if(map.containsKey(a)) {

				if(map.get(a) != b) {

					System.out.println("-1");
					return;
				}
			}else {

				map.put(a, b);

			}
		}


		if(map.containsKey(1)) {
			if(map.get(1) == 0) {
				System.out.println("-1");
				return;
			}
		}


		StringBuilder sb = new StringBuilder();

		for(int i = 1; i < n + 1; i++) {

			if(map.containsKey(i)) {
			
				sb.append(map.get(i));
			
			}else {

				if(i == 1) {
					sb.append("1");
				}else {
					sb.append("0");
				}

			}

		}

		System.out.println(sb.toString());

	}
}