
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] ary = new Integer[3];
		ary[0] = sc.nextInt();
		ary[1] = sc.nextInt();
		ary[2] = sc.nextInt();
		Arrays.sort(ary);
		System.out.println(ary[0] * ary[1] / 2);
	}
}
