import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		long m = (long)Math.pow(10,9)+7;

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[Integer.parseInt(sc.next())] += 1;
		}

		if (n%2 == 1){
			if (a[0] != 1){
				System.out.println(0);
				return;
			}
			for (int i=1; i<=(n-1)/2; i++){
				if (a[2*i] != 2){
					System.out.println(0);
					return;
				}
			}
			System.out.println((long)Math.pow(2, (n-1)/2)%m);
			return;
		}else {
			for (int i=0; i<n/2; i++){
				if (a[2*i] != 2){
					System.out.println(0);
					return;
				}
			}
			System.out.println((long)Math.pow(2, n/2)%m);
			return;
		}
	}
}
