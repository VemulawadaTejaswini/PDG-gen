import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n      = Integer.parseInt(scanner.nextLine());
		String[] t = scanner.nextLine().split(" ");
		int[] list = new int[n + 1];
		Map<Integer, Integer> gmap = new HashMap<>();
		Map<Integer, Integer> kmap = new HashMap<>();

		for(int i = 1; i <= n; i++) {

			list[i] = Integer.parseInt(t[i - 1]);
		}

		for(int i = 1; i <= n; i++) {

			if(i % 2 != 0) {

				if(kmap.containsKey(list[i])) {

					kmap.put(list[i], kmap.get(list[i]) + 1);
				}else {

					kmap.put(list[i], 1);
				}
			}else {

				if(gmap.containsKey(list[i])) {

					gmap.put(list[i], gmap.get(list[i]) + 1);
				}else {

					gmap.put(list[i], 1);
				}
			}
		}

		int kmax = 0;
		for(Entry<Integer, Integer> e : kmap.entrySet()) {


			kmax = Math.max(kmax, e.getValue());
		}
		int gmax = 0;
		for(Entry<Integer, Integer> e : gmap.entrySet()) {


			gmax = Math.max(gmax, e.getValue());
		}


		System.out.println(n - kmax - gmax);
	}

}
