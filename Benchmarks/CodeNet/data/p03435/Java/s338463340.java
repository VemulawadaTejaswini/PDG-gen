import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> cList = new ArrayList<>();
		for(int i = 0 ; i < 9 ; i++) {
			cList.add(sc.nextInt());
		}
		if(!verticalCheck(cList, 0) || !verticalCheck(cList, 3)) {
			System.out.println("No");
			return;
		}

		if(!horizonCheck(cList, 0) || !horizonCheck(cList, 1)) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");

	}

	private static boolean verticalCheck(ArrayList<Integer> cList, Integer start) {
		Integer v1 = cList.get(start + 3) - cList.get(start);
		Integer v2 = cList.get(start + 4) - cList.get(start + 1);
		Integer v3 = cList.get(start + 5) - cList.get(start + 2);
		return v1 == v2 && v2 == v3;
	}

	private static boolean horizonCheck(ArrayList<Integer> cList, Integer start) {
		Integer v1 = cList.get(start + 1) - cList.get(start);
		Integer v2 = cList.get(start + 4) - cList.get(start + 3);
		Integer v3 = cList.get(start + 7) - cList.get(start + 6);
		return v1 == v2 && v2 == v3;
	}
}