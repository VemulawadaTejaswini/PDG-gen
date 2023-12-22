import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] st = s.split(" ");
		int[] ints = new int[3];
		for (int i = 0; i < 3; i++) {
			ints[i] = Integer.parseInt(st[i]);
		}
		Arrays.sort(ints);
		System.out.print(ints[0]);
		System.out.print(" ");
		System.out.print(ints[1]);
		System.out.print(" ");
		System.out.println(ints[2]);
	}

}