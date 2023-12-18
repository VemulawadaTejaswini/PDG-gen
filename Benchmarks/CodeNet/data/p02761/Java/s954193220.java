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



		StringBuilder sb = new StringBuilder();


		if(map.containsKey(1)) {
			if(map.get(1) == 0 && n != 1) {
				System.out.println("-1");
				return;
			}else {
				sb.append(map.get(1));
			}
		}else if(n == 1){
			System.out.println("0");
			return;
		}else if(n != 1) {
			sb.append("1");
		}

		for(int i = 2; i < n + 1; i++) {

			if(map.containsKey(i)) {

				sb.append(map.get(i));

			}else {
				sb.append("0");
			}

		}

		System.out.println(sb.toString());

	}
}