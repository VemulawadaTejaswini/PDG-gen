import java.util.ArrayList;
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
		System.out.println("kisuu" + Main.maxcount(kisuu));
		System.out.println("gusuu" + Main.maxcount(gusuu));
		System.out.println((kisuu.size() - Main.maxcount(kisuu)) + (gusuu.size() - Main.maxcount(gusuu)));
	}
	static int maxcount(ArrayList<Integer> list) {
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					count++;
				}
			}
			//count--;
			max= Math.max(max, count);
		}
		return max;
	}
}