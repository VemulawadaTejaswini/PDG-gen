import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] longArray = new long[n];
		for(int i = 0; i < n; i++) {
			longArray[i] = sc.nextInt();
		}
		System.out.println(longArray[4]);
	}

}