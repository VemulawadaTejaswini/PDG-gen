import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] l = new long[n];
		for(int i = 0 ; i < n ; i++) {
			l[i] = sc.nextLong();
		}
		long count = 0;
		for(int a = 0 ;  a < n ; a++) {
			for(int b = a + 1 ; b < n ; b++) {
				for(int c = b + 1 ; c < n ; c++) {
					long l1 = l[a];
					long l2 = l[b];
					long l3 = l[c];
					if(l1 + l2 > l3 && l2 + l3 > l1 && l3 + l1 > l2 && l1 != l2 && l1 != l3 && l3 != l2)
						count++;

				}
			}

		}

		sc.close();
		System.out.println(count);

	}
}

