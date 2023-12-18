

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class　Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[n];
		int[] v = new int[n];

		ArrayList<Integer> arr0 = new ArrayList<Integer>();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		ArrayList<Integer> arr3 = new ArrayList<Integer>();

		arr0.add(0);
		arr1.add(0);
		arr2.add(0);
		arr3.add(0);

		for (int i = 0; i < n; i++) {
			w[i] = Integer.parseInt(sc.next());
			v[i] = Integer.parseInt(sc.next());
			if (w[i] - w[0] == 0)
				arr0.add(v[i]);
			if (w[i] - w[0] == 1)
				arr1.add(v[i]);
			if (w[i] - w[0] == 2)
				arr2.add(v[i]);
			if (w[i] - w[0] == 3)
				arr3.add(v[i]);
		}

		Collections.sort(arr0, Collections.reverseOrder());
		Collections.sort(arr1, Collections.reverseOrder());
		Collections.sort(arr2, Collections.reverseOrder());
		Collections.sort(arr3, Collections.reverseOrder());

		ArrayList<Long> arrsum0 = new ArrayList<Long>();
		ArrayList<Long> arrsum1 = new ArrayList<Long>();
		ArrayList<Long> arrsum2 = new ArrayList<Long>();
		ArrayList<Long> arrsum3 = new ArrayList<Long>();

		arrsum0.add(0l);
		arrsum1.add(0l);
		arrsum2.add(0l);
		arrsum3.add(0l);
		long sum = 0;

		for (int i = 0; i < arr0.size(); i++) {
			sum += arr0.get(i);
			arrsum0.add(sum);
		}

		sum = 0;

		for (int i = 0; i < arr1.size(); i++) {
			sum += arr1.get(i);
			arrsum1.add(sum);
		}

		sum = 0;

		for (int i = 0; i < arr2.size(); i++) {
			sum += arr2.get(i);
			arrsum2.add(sum);
		}

		sum = 0;

		for (int i = 0; i < arr3.size(); i++) {
			sum += arr3.get(i);
			arrsum3.add(sum);
		}

		long max = 0;

		for (int i = 0; i < arr0.size(); i++) {
			for (int j = 0; j < arr1.size(); j++) {
				for (int k = 0; k < arr2.size(); k++) {
					for (int m = 0; m < arr3.size(); m++) {
						if (i * w[0] + j * (w[0] + 1) + k * (w[0] + 2) + m * (w[0] + 3) > W)
							continue;
						max = Math.max(max, arrsum0.get(i) + arrsum1.get(j) + arrsum2.get(k) + arrsum3.get(m));
					}
				}
			}
		}

		System.out.println(max);

	}

}
