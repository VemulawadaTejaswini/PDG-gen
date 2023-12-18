import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int c = scanner.nextInt();
		int xs[] = new int[n+1];
		xs[0]=0;
		int vSum1[] = new int[n+1];
		int vSum2[] = new int[n+1];	//逆周り
		vSum1[0]=0;
		vSum2[0]=0;
		int e1[] = new int[n+1];
		int e2[] = new int[n+1];

		ArrayList<int[]> max1 = new ArrayList<>();
		ArrayList<int[]> max2 = new ArrayList<>();


		for (int i=1; i<=n; i++) {
			xs[i] = scanner.nextInt();
			vSum1[i] = scanner.nextInt() + vSum1[i-1];
			e1[i] = vSum1[i] - xs[i];
			if (max1.isEmpty() || e1[i] >= max1.get(max1.size()-1)[1]) {
				int[] tmp = {xs[i], e1[i]};
				max1.add(tmp);
			}
		}
		for (int i=n; i>=1; i--) {
			vSum2[i] = vSum1[n] - vSum1[i-1];
			e2[i] = vSum2[i] - (c-xs[i]);
			if (max2.isEmpty() || e2[i] >= max2.get(max2.size()-1)[1]) {
				int[] tmp = {xs[i], e2[i]};
				max2.add(tmp);
			}
		}


		int max = 0;
		int ind = max2.size()-1;
		big1:for (int[] data: max1) {
			while (max2.get(ind)[0] <= data[0]) {
				if (ind==0) {
					break big1;
				}
				ind--;
			}
			if (data[0] >= max2.get(ind)[1]) {
				max = Math.max(max, data[1]);
			}else {
				max = Math.max(max, data[1]-data[0]+max2.get(ind)[1]);
			}
		}
		ind = max1.size()-1;
		big2:for (int[] data: max2) {
			while (max1.get(ind)[0] <= data[0]) {
				if (ind==0) {
					break big2;
				}
				ind--;
			}
			if (c-data[0] >= max1.get(ind)[1]) {
				max = Math.max(max, data[1]);
			}else {
				max = Math.max(max, data[1]-(c-data[0])+max1.get(ind)[1]);
			}
		}

		System.out.println(max);
	}

}