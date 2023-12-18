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
		ArrayList<Integer> katanaA = new ArrayList<>();
		ArrayList<Integer> katanaB = new ArrayList<>();
		katanaSet(katanaA, katanaB, a, b);
		int answer = 0;
		if (n==1) {
			if (b[0] > a[0]) {
				h=h-b[0];
				for (answer = 1; ; answer++) {
					if (h<=0) {
						break;
					}
					h=h-a[0];
				}
				
			} else {
				for (answer = 0; ; answer++) {
					if (h<=0) {
						break;
					}
					h=h-a[0];
				}
			}
		} else if (katanaA.get(max(katanaA))>=katanaB.get(max(katanaB))) {
			for (answer = 1; ; answer++) {
				if (h<=0) {
					break;
				}
				h=h-a[max(katanaA)];
			}
		} else {
			int atk = max(katanaA);
			katanaA.remove(atk);
			katanaB.remove(atk);
			while (a[atk]<katanaB.get(max(katanaB)) ) {
				if (a[atk]>=h || b[atk]>=h) {
					break;
				}
				h=h-katanaB.get(max(katanaB));
				katanaA.remove(katanaA.get(max(katanaB)) );
				katanaB.remove(katanaB.get(max(katanaB)) );
				answer=answer+1;
				if (katanaA.size()==0) {
					break;
				}
			}
			if (a[atk]>=b[atk]) {
				for (answer = answer; ; answer++) {
					if (h<=0) {
						break;
					}
					h=h-a[atk];
				}
			} else {
				h=h-b[atk];
				for (answer = answer+1; ; answer++) {
					if (h<=0) {
						break;
					}
					h=h-a[atk];
				}
			}
		}

		System.out.println(answer);
	}

	public static void katanaSet(ArrayList<Integer> katanaA, ArrayList<Integer> katanaB, int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			katanaA.add(a[i]);
			katanaB.add(b[i]);
		}
	}

	public static int max(ArrayList<Integer> katana) {
		int max = 0;

		for (int i = 1; i < katana.size(); i++) {
			if (katana.get(i) > katana.get(max)) {
				max = i;
			}
		}

		return max;
	}
}