
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_5_D-in19.txt"));

		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		long cnt = 0;
		for (int i = 0; i < n; i++) {
			int x = a[i];
			for (int j = i + 1; j < n; j++)
				if (x > a[j])
					cnt++;
		}
		System.out.println(cnt);

		scan.close();
		System.exit(0);
	}
}