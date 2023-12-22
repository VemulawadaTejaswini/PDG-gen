
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int[][] x = new int[Integer.valueOf(N.split(" ")[0]) + 1][2];
		String M = sc.nextLine();
		int i = 1;
		for (String y : M.split(" ")) {
			x[i][0] = Integer.valueOf(y);
			i++;
		}
		int e = Integer.valueOf(N.split(" ")[1]);
		HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		while (e-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			setEdge(map, a, b);
		}
		for (int j = 1; j < x.length; j++) {
			List<Integer> l = map.get(j);
			if (l != null) {
				for (int k : l) {
					if (x[j][0] > x[k][0]) {
						x[k][1] = -1;
					} else {
						x[j][1] = -1;
					}
				}
			}
		}
		i = 0;
		for (int j = 1; j < x.length; j++) {
			if(x[j][1] != -1) {
				i++;
			}
		}
		System.out.println(i);

	}

	public static void setEdge(HashMap<Integer, List<Integer>> map, int a, int b) {
		List<Integer> l = map.get(a);
		if (l != null) {
			l.add(b);
			map.put(a, l);
		} else {
			l = new ArrayList<Integer>();
			l.add(b);
			map.put(a, l);
		}
		
		List<Integer> l1 = map.get(b);
		if (l1 != null) {
			l1.add(a);
			map.put(b, l1);
		} else {
			l1 = new ArrayList<Integer>();
			l1.add(a);
			map.put(b, l1);
		}
	}

}
