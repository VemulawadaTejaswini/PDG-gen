import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();

		ArrayList<String> snList = new ArrayList<String>();

		for(int i = 0; i < N; i++) {
			snList.add(sc.next());
		}

		Collections.sort(snList,Comparator.naturalOrder());

		for(int i = 0; i < N; i++) {
			System.out.print(snList.get(i));
		}
	}

}