import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		int q = s.nextInt();
		int r = s.nextInt();
		System.out.println(Main.calc(p, q, r));
	}

	public static int calc(int p, int q, int r) {

		Integer array[]= {p,q,r};
		Arrays.sort(array);
		return array[0]+array[1];
	}

}