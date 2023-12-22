

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();

		ArrayList<Integer>array = new ArrayList<Integer>();

		for(int i = 0 ; i < K ; i++) {
			int d = scanner.nextInt();
			for(int j = 0 ; j < d ; j++) {
				int A = scanner.nextInt();
				if(!array.contains(A)) {
					array.add(A);
				}
			}
		}

		System.out.println(N - array.size());

		scanner.close();

	}

}
