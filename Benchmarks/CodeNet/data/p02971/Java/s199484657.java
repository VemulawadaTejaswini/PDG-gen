import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		int max = 0;

		for(int i = 0;i < n;i++) {
			list.add(scan.nextInt());
		}

		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				if(!(i == j)) {
					if(list.get(j) >= max) {
						max = list.get(j);
					}
				}
			}

			System.out.println(max);
			max = 0;
		}
	}
}