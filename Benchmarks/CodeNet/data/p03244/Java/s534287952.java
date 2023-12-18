import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		sc.close();

		Map<Integer, Obj> map1 = new HashMap<>();
		Map<Integer, Obj> map2 = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				addMap(map1, v[i]);
			} else {
				addMap(map2, v[i]);
			}
		}

		Obj[] arr1 = getArr(map1);
		Obj[] arr2 = getArr(map2);
		if (arr1[0].v != arr2[0].v) {
			System.out.println(n - arr1[0].cnt - arr2[0].cnt);
		} else {
			if (arr1.length == 1) {
				if (arr2.length == 1) {
					System.out.println(n / 2);
				} else {
					System.out.println(n - arr1[0].cnt - arr2[1].cnt);
				}
			} else {
				if (arr2.length == 1) {
					System.out.println(n - arr1[1].cnt - arr2[0].cnt);
				} else {
					int max = Math.max(arr1[0].cnt + arr2[1].cnt, arr1[1].cnt + arr2[0].cnt);
					System.out.println(n - max);
				}
			}
		}
	}

	static class Obj {
		int v, cnt;
	}

	static Obj[] getArr(Map<Integer, Obj> map) {
		Obj[] arr = map.values().toArray(new Obj[0]);
		Arrays.sort(arr, (o1, o2) -> o2.cnt - o1.cnt);
		return arr;
	}

	static void addMap(Map<Integer, Obj> map, Integer key) {
		if (map.containsKey(key)) {
			map.get(key).cnt++;
		} else {
			Obj o = new Obj();
			o.v = key;
			o.cnt = 1;
			map.put(key, o);
		}
	}
}
