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
		int i = 0;
		int count = 0;
		for (int j = v - 1; j > i; j--) {
			int key = j - 1;
			while (key >= 0) {
				if (vs[key] > vs[j]) {
					int a = vs[key];
					int b = vs[j];

					vs[key] = b;
					vs[j] = a;
					count++;
				}
				key--;
			}

		}
		for (int j = 0; j < v-1 ; j++) {
			System.out.print(vs[j]+" ");
			
		}
				System.out.println(vs[v-1]);
				System.out.println(count);
			
		

	}
}