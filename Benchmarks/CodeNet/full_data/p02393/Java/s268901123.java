import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nStr = new String[3];
		int[] n = new int[nStr.length];
		for (int i = 0; i < nStr.length; i++) {
			nStr[i] = sc.next();
		}

		for (int i = 0; i < n.length; i++) {
			 n[i] = Integer.parseInt(nStr[i]);
		}

		for (int i = 1; i < n.length; i++) {
			if(n[i - 1] < n[i]) {
				int tmp = n[i -1];
				n[i - 1] = n[i];
				n[i] = tmp;
			}
		}

		for (int i : n) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}