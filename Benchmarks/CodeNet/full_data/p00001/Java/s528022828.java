import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i;
		int ar[] = new int[100];
		
		int idx = 0;
		
		while ( sc.hasNext() ) {
			int n = sc.nextInt();
			i = idx - 1;
			while (i >= 0 && n < ar[i]) {
				ar[i + 1] = ar[i];
				--i;
			}
			ar[i + 1] = n;
			++idx;
		}
		for ( i = idx - 1 ; i >= 0 && i >= idx - 3 ; --i ) {
			System.out.println(ar[i]);
		}
	}

}