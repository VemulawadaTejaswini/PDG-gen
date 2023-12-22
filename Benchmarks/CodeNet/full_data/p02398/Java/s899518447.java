import java.util.Scanner;

public class Main {

	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] k = line.split(" ");
		int[] v = new int[k.length];
		for (int i = 0; i < v.length; i++) {
			v[i] = Integer.parseInt(k[i]);
		}
		int count = 0;
		for (int i = v[0]; i <= v[1]; i++) {
			if (v[2] % i == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}