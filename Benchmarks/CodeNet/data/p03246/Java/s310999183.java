import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		ArrayList<Integer> ov = new ArrayList<Integer>();
		ArrayList<Integer> ev = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if ((i + 1) % 2 != 0) {
				ov.add(Integer.parseInt(scanner.next()));
			} else {
				ev.add(Integer.parseInt(scanner.next()));
			}
		}
		Collections.sort(ov);
		int maxOddNum = 0;
		int index = 0;
		int i = 0;
		int repOddNum = 0;
		for (int num : ov) {
			if (ov.get(index) != num) {
				if ((i - index) > maxOddNum) {
					maxOddNum = i - index;
					repOddNum = ov.get(index);
				}
				index = i;
			}
			if ((i + 1) == ov.size()) {
				if (((i + 1) - index) > maxOddNum) {
					maxOddNum = (i + 1) - index;
					repOddNum = ov.get(index);
				}
			}
			i++;
		}

		Collections.sort(ev);
		int maxENum = 0;
		index = 0;
		i = 0;
		for (int num : ev) {
			if (ev.get(index) != num) {
				if (ev.get(index) != repOddNum) {
					if ((i - index) > maxENum) {
						maxENum = i - index;
					}
				}
				index = i;
			}
			if ((i + 1) == ov.size()) {
				if (ev.get(index) != repOddNum) {
					if (((i + 1) - index) > maxENum) {
						maxENum = (i + 1) - index;
					}
				}
			}
			i++;
		}


		System.out.println(n - (maxOddNum + maxENum));
	}

}
