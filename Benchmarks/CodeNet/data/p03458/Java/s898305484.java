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
		for (int i = 0; i <= k; i++) {
			for (int j = 0; j <= k; j++) {
				int count = 0;
				for (int l = 0; l < n; l++) {
					if ((i <= xArr[l] && i + k > xArr[l]) ^ (j <= yArr[l] && j + k > yArr[l])) {
						count++;
					}
				}
				if (max < count) {
					max = count;
				}
			}
		}
		System.out.println(max);
	}
}
