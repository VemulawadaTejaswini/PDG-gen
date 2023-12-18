import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] list = new long[n];
		int count = n;
		for(int i = 0; i < n; i++) {
			list[i] = sc.nextLong();
		}

		for(int i = n - 1 ; i >= 0; i-=2) {
			System.out.print(list[i]);
			count--;
			if(count <= 0) {
				System.out.print("\n");
			} else {
				System.out.print(" ");
			}
		}

		for(int i = n - 2; i >= 0; i-=2) {
			System.out.print(list[i]);
			count--;
			if(count <= 0) {
				System.out.print("\n");
			} else {
				System.out.print(" ");
			}
		}
	}
}
