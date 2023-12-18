import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = Integer.parseInt(str);
		str = scan.next();
		int h = Integer.parseInt(str);
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			str = scan.next();
			a[i] = Integer.parseInt(str);
			str = scan.next();
			b[i] = Integer.parseInt(str);
		}
		int max = 0;

		for (int i = 1; i < n; i++) {
			if (a[i] > a[max]) {
				max = i;
			}
		}

		ArrayList<Integer> katana = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (b[i] > a[max]) {
				katana.add(b[i]);
			}
		}


		int answer = 0;

		for (answer = 0; h>0; answer++) {
			if (katana.size()>0) {
				int max_ = maxKatana(katana)
				h=h-katana.get(max_);
				katana.remove(max_);
			} else {
				h=h-a[max];
			}
		}

		
		System.out.println(answer);
	}

	
	public static int maxKatana(ArrayList<Integer> katana) {
		int max = 0;

		for (int i = 1; i < katana.size(); i++) {
			if (katana.get(i) > katana.get(max)) {
				max = i;
			}
		}

		return max;
	}
}