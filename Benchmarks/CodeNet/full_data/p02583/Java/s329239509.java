import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		int n = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int count = 0;

		for (int j = 0; j < n; j++) {
			for (int k = j + 1; k < n; k++) {
				for (int l = k + 1; l < n; l++) {

					int a = list.get(j);
					int b = list.get(k);
					int c = list.get(l);

					if (a == b || b == c || c == a) {
						continue;
					}
					if (calc(a,b,c)) {
						count++;
					}

				}
			}
		}

		System.out.println(count);
	}


	private static boolean calc(int a,int b,int c){

		Optional<Integer> max = Arrays.asList(a,b,c).stream().max((x,y) -> x-y);
		Integer sum = Arrays.asList(a,b,c).stream().reduce(0,(x,y) -> x+y);


		return (sum - max.get()) > max.get();
	}


}