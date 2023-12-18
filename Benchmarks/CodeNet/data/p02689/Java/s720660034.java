import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] high = new int[n];
		int num1 = 0;
		int num2 = 0;
		boolean sw = false;
		int counter = 0;

		ArrayList<ArrayList<Integer>> b_list = new ArrayList<ArrayList<Integer>>(n);

		for(int i = 0;i < n;i++) {
			b_list.add(new ArrayList<Integer>());
		}

		for(int i = 0;i < n;i++) {
			high[i] = scan.nextInt();
		}

		for(int i = 0;i < m;i++) {
			num1 = scan.nextInt();
			num2 = scan.nextInt();

			b_list.get(num1 - 1).add(num2 - 1);
			b_list.get(num2 - 1).add(num1 - 1);
		}

		for(int i = 0;i < n;i++) {
			for(int j = 0;j < b_list.get(i).size();j++) {
				if(high[i] <= high[b_list.get(i).get(j)]) {
					sw = true;
					break;
				}
			}

			if(!(sw)) {
				counter += 1;
			}

			sw = false;
		}

		System.out.println(counter);
	}
}