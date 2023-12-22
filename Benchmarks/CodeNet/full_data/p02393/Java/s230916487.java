import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
    int[] ary = {s.nextInt(), s.nextInt(), s.nextInt()};
    Arrays.sort(ary);
    System.out.println(ary[0] + " " + ary[1] + " " + ary[2]);
	}
}
