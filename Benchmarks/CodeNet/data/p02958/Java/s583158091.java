
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.PriorityQueue;
	import java.util.Queue;
	import java.util.Scanner;
	import java.util.Set;

	public class Main{

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int n = Integer.parseInt(scanner.nextLine());
			String[] t = scanner.nextLine().split(" ");
			int[] list = new int[n];

			List<Integer> r = new ArrayList<>();
			list[0] = Integer.parseInt(t[0]);
			for(int i = 1; i < n; i ++) {


				list[i] = Integer.parseInt(t[i]);
				if(list[i - 1] > list[i]) {
					if(i - 1 == 0)r.add(i - 1);
					else r.add(i);
				}
			}

			boolean flg = true;

			switch(r.size()) {
				case 0:
					flg = true;
					break;
				case 2:
					int temp = list[r.get(0)];
					list[r.get(0)] = list[r.get(1)];
					list[r.get(1)] = temp;
					for(int i = 1; i < n; i++) {
						if(list[i - 1] > list[i]) {

							flg = false;
							break;
						}
					}
					break;
				default:
					flg = false;
			}

			if(flg) {

				System.out.println("YES");
			}else {
				System.out.println("NO");

			}
		}
	}