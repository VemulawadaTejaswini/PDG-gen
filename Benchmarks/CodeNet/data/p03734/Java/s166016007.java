import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] keys = new int[n];
		ArrayList<Integer>[] lists = new ArrayList[4];
		for (int i = 0; i < 4; i++) {
			lists[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				if (keys[j] == 0) {
					keys[j] = x;
					lists[j].add(y);
					break;
				} else if (keys[j] == x) {
					lists[j].add(y);
					break;
				}
			}
		}
		for (ArrayList<Integer> list : lists) {
			Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i2.intValue() - i1.intValue();
			}
			});
 		}
		long max = 0;
		long value1 = 0;
		for (int i = -1; i < lists[0].size(); i++) {
			int weight1 = (i + 1) * keys[0];
			if (weight1 > w) {
				break;
			}
			if (i >= 0) {
				value1 += lists[0].get(i);
			}
			long value2 = value1;
			for (int j = -1; j < lists[1].size() ; j++) {
				int weight2 = weight1 + (j + 1) * keys[1];
				if (weight2 > w) {
					break;
				}
				if (j >= 0) {
					value2 += lists[1].get(j);
				}
				long value3 = value2;
				for (int k = -1; k < lists[2].size(); k++) {
					int weight3 = weight2 + (k + 1) * keys[2];
					if (weight3 > w) {
						break;
					}
					if (k >= 0) {
						value3 += lists[2].get(k);
					}
					long value4 = value3;
					for (int l = 0; l < lists[3].size(); l++) {
						int weight4 = weight3 + (l + 1) * keys[3];
						if (weight4 > w) {
							break;
						}
						value4 += lists[3].get(l);
					}
					max = Math.max(max, value4);
				}
				max = Math.max(max, value3);
			}
			max = Math.max(max, value2);
		}
		max = Math.max(max, value1);
		System.out.println(max);
	}
}
