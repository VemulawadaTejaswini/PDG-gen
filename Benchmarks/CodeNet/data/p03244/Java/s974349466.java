import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextInt();
			if (i % 2 == 0) {
				odd.add(v[i]);
			} else {
				even.add(v[i]);
			}
		}
		Collections.sort(odd);
		Collections.sort(even);
		int temp = 1;
		int oddmax = 0;
		int oddsecond = 0;
		String oddkey = String.valueOf(odd.get(0));
		for (int i = 1; i < odd.size(); i++) {
			if (odd.get(i) == odd.get(i-1) && i != odd.size()-1) {
				temp++;
			} else {
				if (odd.get(i) == odd.get(i-1) && i == odd.size()-1) {
					temp++;
				}
				if (temp >= oddmax) {
					oddsecond = oddmax;
					oddmax = temp;
					oddkey = String.valueOf(odd.get(i));
					temp = 1;
				} else if (oddsecond < temp) {
					oddsecond = temp;
					temp = 1;
				} else {
					temp = 1;
				}
			}
		}
		int evenmax = 0;
		int evensecond = 0;
		String evenkey = String.valueOf(even.get(0));
		for (int i = 1; i < even.size(); i++) {
			if (even.get(i) == even.get(i-1) && i != even.size()-1) {
				temp++;
			} else {
				if (even.get(i) == even.get(i-1) && i == even.size()-1) {
					temp++;
				}
				if (temp >= evenmax) {
					evensecond = evenmax;
					evenmax = temp;
					evenkey = String.valueOf(even.get(i));
					temp = 1;
				} else if (evensecond < temp) {
					evensecond = temp;
					temp = 1;
				} else {
					temp = 1;
				}
			}
		}
		if (Integer.parseInt(oddkey) != Integer.parseInt(evenkey)) {
			System.out.println((odd.size()-oddmax) + (even.size()-evenmax));
		} else {
			if (oddmax <= evenmax) {
				System.out.println((odd.size()-oddmax) + (even.size()-evensecond));
			} else {
				System.out.println((odd.size()-oddsecond) + (even.size()-evenmax));
			}
		}
 	}
}
