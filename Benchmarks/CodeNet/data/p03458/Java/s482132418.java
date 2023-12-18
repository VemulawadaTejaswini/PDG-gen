import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] xArr = new int[n];
		int[] yArr = new int[n];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			String s = sc.next();
			if (s.equals("W")) {
				y += k;
			}
			xArr[i] = x % (2 * k);
			yArr[i] = y % (2 * k);
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (Math.abs(xArr[i] - xArr[j]) < k && Math.abs(yArr[i] - yArr[j]) < k) {
					count++;
				}
			}
			if (max < count) {
				max = count;
			}
		}
		System.out.println(max);
	}
}
