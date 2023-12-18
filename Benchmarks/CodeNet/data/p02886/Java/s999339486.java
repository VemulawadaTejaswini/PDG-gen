import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		int sum = 0;
		int [] a = new int[n];
		for(int i = 0;i < n; i++) {
			a[i] = stdIn.nextInt();
		}

		for(int i = 0; i < n; i++) {
			for(int j = 1; i < j; j++) {
				sum+=a[i]+a[j];
			}
		}

		System.out.println(sum);


	}

}
