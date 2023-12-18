import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
//List<Integer> list = new ArrayList<>();

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		/*int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = stdIn.nextInt();*/
		String s = "NO";
		if (n <= k) 
			s = "NO";
		else {
			if (n % 2 == 0) {
				if (k <= n / 2)
					s = "YES";
			}
			else
				if (k <= (n+1) / 2)
					s = "YES";
		}

		System.out.println(s);
	}
}