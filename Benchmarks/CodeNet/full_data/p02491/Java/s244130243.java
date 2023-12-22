
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] ary = new long[]{sc.nextLong(), sc.nextLong(), sc.nextLong()};
		Arrays.sort(ary);
		System.out.println(ary[0] + " " + ary[1] + " " + ary[2]);
	}
}