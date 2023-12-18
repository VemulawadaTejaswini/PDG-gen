import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		ArrayList<Integer> liList = new ArrayList<Integer>();

		for(int i = 1; i <= N; i++) {
			liList.add(sc.nextInt());
		}

		Collections.sort(liList, Comparator.reverseOrder());

		int result = 0;
		for(int i = 0; i < K; i++) {
			result += liList.get(i);
		}
		System.out.println(result);
	}
}