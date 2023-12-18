import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static int n = 0;

	public static void main(String[] args) {


		int anser = 100000000;

		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();

		ArrayList<Integer> address = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			address.add(scan.nextInt());
		}

		Collections.sort(address);

		for (int i = address.get(0); i <= address.get(n-1); i++) {

			int sum = sumList(address,i);

			if(anser > sum) {
				anser = sum;
			}

		}

		System.out.println(anser);
	}

	private static int sumList(ArrayList<Integer> array,int j) {

		int sum =0;

		for (int i = 0; i < n; i++) {
			sum = sum + (j-array.get(i))*(j-array.get(i));
		}

		return sum;

	}

}
