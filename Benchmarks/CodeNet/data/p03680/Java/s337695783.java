import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		int index = 0;
		int nextIndex = -1;
		boolean isOK = false;
		int ans = 0;
		int count = 0;
		while (true) {
			count++;
			nextIndex = a[index] - 1;
			if (index == a[nextIndex] - 1 || a.length == count) {
				break;
			}
			ans++;
			if (a[index] == 2) {
				isOK = true;
				break;
			}
			index = nextIndex;
		}
		System.out.println(isOK ? ans : -1);
		sc.close();
	}
}