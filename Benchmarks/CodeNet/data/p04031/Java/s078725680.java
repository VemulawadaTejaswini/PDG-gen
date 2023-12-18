import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];


		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}


		int avg = (int) Math.round((double)sum / n);
		/*int closest = -1;
		int closestIndex = -1;
		int dif = sum;
		for (int i = 0; i < n; i++) {
			int curDif = Math.abs(avg - a[i]);
			if (curDif < dif) {
				closest = a[i];
				closestIndex = i;
				dif = curDif;
			}
		}
		*/


		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += Math.pow(a[i] - avg, 2);
		}

		System.out.println(ans);
	}
}