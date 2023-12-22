import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int[] mountain = new int[10];
		for (i = 0; i < 10; i++) {
			mountain[i] = sc.nextInt();
		}
		Arrays.sort(mountain);
		System.out.println(mountain[9]);
		System.out.println(mountain[8]);
		System.out.println(mountain[7]);
	}
}