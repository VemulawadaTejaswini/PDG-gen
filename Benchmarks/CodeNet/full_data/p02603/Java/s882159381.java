import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for(int i = 1 ; i <= n ; i++) {
			a[i] = sc.nextInt();
		}
		boolean katteru = false;
		int sum = 10;
		int kabusuu = 0;
		for(int i = 2 ; i <= n ; i++) {
			if(!katteru) {
				if(a[i] > a[i - 1] && sum >= a[i - 1]) {
					katteru = true;
					kabusuu = sum / a[i - 1];
					sum -= kabusuu * a[i - 1];
				}
			}
			else {
				if(a[i] < a[i - 1]) {
					katteru = false;
                  sum += kabusuu * a[i - 1];
					kabusuu = 0;
				}
			}

			if(i == n && katteru)
				sum += kabusuu * a[i];
		}


		sc.close();
		System.out.println(sum);

	}
}

