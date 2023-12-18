import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<Integer> getStrings(Scanner sc, int num) {
		List<Integer> stringList = new ArrayList<>();
		while(num>0) {
			int nextInt = sc.nextInt();
			stringList.add(nextInt);
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> array = getStrings(sc, n-1);

		int[] jyoshi = new int[n];
		Arrays.fill(jyoshi,0);
		for (int i = 0; i < array.size(); i++) {
			jyoshi[array.get(i)-1]+=1;
		}

		for (int i = 0; i < jyoshi.length; i++) {
			System.out.println(jyoshi[i]);
		}
	}

}
