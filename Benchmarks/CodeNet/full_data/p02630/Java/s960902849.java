import java.util.HashMap;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap<>();

		int n = stdIn.nextInt();

		long cnt = 0;

		for(int i = 0; i < n; i++) {
			int num = stdIn.nextInt();
			cnt += num;

			if(!map.containsKey(num)) {
				map.put(num,0);
			}
			map.put(num,map.get(num)+1);

		}

		int q = stdIn.nextInt();

		for(int i = 0; i < q; i++) {
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();

			if(!map.containsKey(b)) {
				System.out.println(cnt);
				continue;
			}

			if(!map.containsKey(c)) {
				map.put(c,map.get(b));
				cnt += (c-b)*map.get(b);
				map.put(b,0);
				System.out.println(cnt);
				continue;
			}

			cnt += (c-b)*map.get(b);

			map.put(c,map.get(c)+map.get(b));

			map.put(b,0);

			System.out.println(cnt);
		}



	}

}
