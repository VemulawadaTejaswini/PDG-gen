import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> aiList = new ArrayList<Integer>();

		for(int i = 0; i < N; i++) {
			aiList.add(sc.nextInt());
		}

		Collections.sort(aiList, Comparator.reverseOrder());

		int countAlice = 0;
		int countBob = 0;
		for(int i = 0; i < N; i++) {
			if(i % 2 == 0) {
				countAlice += aiList.get(i);
			}else {
				countBob += aiList.get(i);
			}
		}
		System.out.println(countAlice - countBob);
	}

}