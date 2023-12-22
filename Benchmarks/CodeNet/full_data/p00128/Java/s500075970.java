
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while (scanner.hasNext()) {
			if(count!=0){
				System.out.println();
			}
			int n = scanner.nextInt();
			int[] num = new int[5];
			int[] a = { 10000, 1000, 100, 10, 1 };
			for (int i = 0; i < 5; i++) {
				num[i] = n / a[i];
				n = n % a[i];
			}
			for (int i = 0; i < 5; i++) {
				if (num[i] < 5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			for (int i = 0; i < 5; i++) {
				if (num[i] > 4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			int t = 5;
			while (t-- > 0) {
				System.out.print("=");
			}
			System.out.println();
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (!(num[j] % 5 == i))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			count++;
		}
	}
}