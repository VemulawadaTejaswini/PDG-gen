import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a[] = new int[100];

		int n = scan.nextInt();
		int counter=0;
		for (int i = 0; i < n; i++) {

			a[i] = scan.nextInt();

		}

		for (int x = 0; x < n; x++) {

			if (a[0] <= a[x]) {
				counter++;
			}

		}

		System.out.println(counter);
		
	}

}
