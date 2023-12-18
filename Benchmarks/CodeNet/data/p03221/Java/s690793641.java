import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int[] pList = new int[m];
		int[] yList = new int[m];
		List<TreeSet<Integer>> treeList = new ArrayList<TreeSet<Integer>>();
		for (int i = 0; i < n; i++) {
			treeList.add(new TreeSet<Integer>());
		}

		for (int i = 0; i < m; i++) {
			int pi = scanner.nextInt();
			int yi = scanner.nextInt();
			TreeSet<Integer> piTree = treeList.get(pi-1);
			piTree.add(yi);
			pList[i] = pi;
			yList[i] = yi;
		}

		List<HashMap<Integer, Integer>> mapList = new ArrayList<HashMap<Integer, Integer>>();
		for (int i = 0; i < n; i++) {
			TreeSet<Integer> piTree = treeList.get(i);
			HashMap<Integer, Integer> piMap = new HashMap<Integer, Integer>();
			int j = 0;
			for (int yi : piTree) {
				piMap.put(yi, ++j);
			}
			mapList.add(piMap);
		}

		for (int i = 0; i < m; i++) {
			HashMap<Integer, Integer> piMap = mapList.get(pList[i]-1);
			int num = piMap.get(yList[i]);
			System.out.println(String.format("%06d", pList[i]) + String.format("%06d", num));
		}

	}

}
