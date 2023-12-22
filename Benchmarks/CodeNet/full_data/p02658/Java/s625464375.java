import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//long[] a = new long[n];
		long all = 1;


		for(int i = 0 ; i < n ; i++) {
			all *= sc.nextLong();
			if(all > 1000000000000000000L) {
				System.out.println(-1);
				return;
			}


		}

		sc.close();
			System.out.println(all);


	}

}
