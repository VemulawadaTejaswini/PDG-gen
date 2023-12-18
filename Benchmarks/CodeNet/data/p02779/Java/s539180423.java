import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();

		int[] a = new int[n];

		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}

		Arrays.sort(a);


		boolean flag = false;

		for(int i = 0; i < n-1; i++) {
			if(a[i]==a[i+1]) {
				flag = true;
			}
		}

		if(flag) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}

	}

}
