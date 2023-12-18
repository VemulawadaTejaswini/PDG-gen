import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();

		int lt = L;
		int N = (getN(L) + 2);
		System.out.print(N + " ");
		
		List<String> map = new ArrayList<>();


		for (int i = 1; i <= getN(L); i++) {
			map.add(i + " " + (i + 1)+" "+ 0);
			map.add(i + " " + (i + 1)+" "+ (1 << (i - 1)));
		}

		while (lt > 0) {
			int tn = getN(lt) + 1;
			map.add(tn + " " + N +" "+ (lt - (1 << (tn - 1))));
			lt -= 1 << (tn - 1);
		}
		System.out.println(map.size());
		for (String key : map) {
			System.out.print(key);
			System.out.println();
		}
	}

	private static int getN(int l) {
		int i = 0;
		while ((1 << i) <= l)
			i++;
		return i - 1;
	}
}
