import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(jadge());
	}

	public static int jadge() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int count = 0;
		int jadge = 0;

		while(true) {
			for(int j = 0; j < n; j++) {
				if(a[j] % 2 == 0) {
					a[j] /= 2;
					jadge++;
				} else {
					return count;
				}
			}
			if(jadge == n) {
				count++;
			}
			jadge = 0;
		}
	}

}