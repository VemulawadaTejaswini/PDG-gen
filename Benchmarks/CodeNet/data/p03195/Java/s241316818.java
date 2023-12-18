import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[]a = new long[n];

		for(int i=0;i<n;i++) {
			a[i]=Long.parseLong(sc.next());
		}
		sc.close();
		if(n == 1) {
			if(a[0]%2==1) {
				System.out.println("first");
			}else {
				System.out.println("second");
			}
			return;
		}


		Arrays.sort(a);
		long max = a[n-1];
		long second = a[n-2];
		if(max % 2 == 0 && second % 2 == 1 || max % 2 == 1 && second % 2 == 0) {
			System.out.println("first");
		}else {
			System.out.println("second");
		}

	}

}
