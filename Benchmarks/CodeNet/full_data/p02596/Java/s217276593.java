import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] ar = { 7, 77, 777, 7777, 77777, 777777, 7777777, 77777777 };

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % n == 0) {
				System.out.println(i + 1);
				return;
			}
			
		}
		
		System.out.println(-1);

//		int res = 0;

	}

}
