import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static int n;

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int v[] = new int[n];
		for (int j = 0; j < n; j++) {
			v[j] = sc.nextInt();
		}
		ArrayList<Integer> kisuu = new ArrayList<>();
		ArrayList<Integer> gusuu = new ArrayList<>();

		for (i = 0; i < n; i++) {
			if (i % 2 == 0) {
				gusuu.add(v[i]);
			} else {
				kisuu.add(v[i]);
			}
		}
//		System.out.println("kisuu" + Main.maxcount(kisuu));
//		System.out.println("gusuu" + Main.maxcountY(gusuu, Main.maxNum(kisuu)));
//		System.out.println("gusuu Num" + Main.maxNum(gusuu));
		//System.out.println((kisuu.size() - Main.maxcount(kisuu)) + (gusuu.size() - Main.maxcountY(gusuu, Main.maxNum(kisuu))));
		System.out.println("kisuu"+Main.maxcountTl(kisuu));
		System.out.println("gusuu"+Main.maxcountTl(gusuu));

		System.out.println((kisuu.size() - Main.maxcountTl(kisuu)) + (gusuu.size() - Main.maxcountTl(gusuu)));
	}

	static int maxcountTl(ArrayList<Integer> list) {
		Collections.sort(list);
		int max = 0;
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		tmp.add(0);
		for (int i = 0; i < list.size() - 1; i++) {
			int count = 0;
			if (!(list.get(i) == list.get(i+1))) {
				tmp.add(i+1);
			}
		}
		for (int i = 0; i < tmp.size()-1; i++) {
			int count = Math.abs(tmp.get(i) - tmp.get(i+1));
			max = Math.max(max, count);

		}
		if (max == 0) {
			return list.size();
		} else {
			return max;
		}
	}

	// 一番多い数を返す
	static int maxNum(ArrayList<Integer> list) {
		int max = 0;
		int a = 0;
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					count++;
				}
			}
			//count--;
			max= Math.max(max, count);
			if (max < count) {
				a = i;
			}
		}
		return list.get(a);
	}
	static int maxcountY(ArrayList<Integer> list, int x) {
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i) == list.get(j) && !(list.get(i) == x)) {
					count++;
				}
			}
			//count--;
			max= Math.max(max, count);
		}
		return max;
	}
}
