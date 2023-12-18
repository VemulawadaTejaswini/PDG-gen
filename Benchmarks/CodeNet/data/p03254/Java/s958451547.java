import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		List<Integer> ai = new ArrayList<>();

		for (int i=0; i<n; i++) {
			ai.add(sc.nextInt());
		}

		int count = 0;
		for(int j=0; j<n; j++) {
			int min = 1000000001;
			int tmp = 0;
			for (int i=0; i<ai.size(); i++) {
				if (ai.get(i) < min) {
					min = ai.get(i);
					tmp = i;
				}
			}
			x = x - min;
			if (x < 0) {
				break;
			} else if (x == 0) {
				count++;
				break;
			} else {
				count++;
				ai.remove(tmp);
			}
		}

		if (0 < x) {
			System.out.println(count-1);
		} else {
			System.out.println(count);
		}

		sc.close();
	}

}