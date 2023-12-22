import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] ints = new int[n];
		for (int i=n-1; i>=0; i--) {
			ints[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++) {
			System.out.print(ints[i]);
			if (i<n-1) {System.out.print(" ");}
		}
	}
}
