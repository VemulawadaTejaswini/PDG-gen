import java.util.Arrays;
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
		Arrays.sort(v);

		System.out.print(v[0]+" ");
		System.out.print(v[1]+" ");
		System.out.print(v[2]);

	}
}