import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		List<Integer> negList = new ArrayList<>();
		List<Integer> posList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			if (x[i] == 0) {
				k--;
			}
			if (x[i] < 0) {
				negList.add(x[i] * -1);
			} else if (x[i] > 0) {
				posList.add(x[i]);
			}
		}
		Collections.sort(negList);
		int negnum = negList.size();
		int posnum = posList.size();
		int count = 300000;
		int temp = 0;
		int negtemp = 0;
		int postemp = 0;
		int range = 0;
		int negrange = 0;
		int posrange = 0;
		if (negnum <= k) {
			negrange += negnum;
		} else {
			negrange += k;
		}
		if (posnum <= k) {
			posrange += posnum;
		} else {
			posrange += k;
		}
		range = negrange + posrange;
		for (int i = 0; i < range-k+1; i++) {
			if (negrange - i - 1 >= 0) {
				negtemp = negList.get(negrange - i - 1);
			} else {
				negtemp = 0;
			}
			if (negrange - i < k) {
				postemp = posList.get(k - (negrange - i) - 1);
			} else {
				postemp = 0;
			}
//			System.out.println(negtemp);
//			System.out.println(postemp);
			temp = (Math.min(negtemp, postemp) * 2) + Math.max(negtemp, postemp);
//			System.out.println(temp);
			if (temp < count) {
				count = temp;
			}
		}
		System.out.println(count);
	}
}