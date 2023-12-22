import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(line);
		int[] vs = new int[v];
		String line2 = sc.nextLine();
		String[] k = line2.split(" ");
		for (int i = 0; i < v; i++) {

			vs[i] = Integer.parseInt(k[i]);
		}
		int count = 0;
		for (int i = v-1; i > 0; i--) {
			int key = i - 1;
			int c =count;
			while (key >= 0) {
				
				if (vs[key] > vs[i]) {

					int a = vs[i];
					int b = vs[key];
					vs[i] = b;
					vs[key] = a;
					count++;
				}if (count==c) {
					count++;
				}
				key--;
			}
		}
		for (int i = 0; i < v - 1; i++) {
			System.out.print(vs[i] + " ");
		}
		System.out.println(vs[v - 1]);
		System.out.println(count-1);

	}
}