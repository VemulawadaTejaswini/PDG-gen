import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		
		int[] a = new int[n];
		Arrays.setAll(a, i -> sc.nextInt());
		
		for (int ai : a) {
			int i = 0;
			while (i * ai + 1 <= d) {
				x++;
				i++;
			}
		}
		
		System.out.println(x);
		
		sc.close();
	}
}


