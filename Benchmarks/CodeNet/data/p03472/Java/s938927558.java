import java.util.ArrayList;
import java.util.Collections;
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
		int max = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		ArrayList<Integer> katana = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (b[i] > max) {
				katana.add(b[i]);
			}
		}

		Collections.sort(katana);

		int answer = 0;

		while (h>0) {
			int max_ = katana.size();
			if (max_>0) {
				h-=katana.get(max_-1);
				katana.remove(max_-1);
				answer++;
			} else {
				answer+=(int) Math.ceil((double)h/max);
				break;
			}
		}

		
		System.out.println(answer);
	}
}