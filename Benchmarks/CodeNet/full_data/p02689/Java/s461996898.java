import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String[] lineString = sc.nextLine().split(" ");
		int numberOfElevation = Integer.parseInt(lineString[0]);
		int numberOfLoad = Integer.parseInt(lineString[1]);

		ArrayList<String> observatoryNotGood = new ArrayList<String>();
		String[] elevationList = sc.nextLine().split(" ");

		for (int load = 0; load < numberOfLoad; load++) {
			lineString = sc.nextLine().split(" ");
			String observatoryA = lineString[0];
			String observatoryB = lineString[1];
			int elevationA = Integer.parseInt(elevationList[Integer.parseInt(observatoryA) - 1]);
			int elevationB = Integer.parseInt(elevationList[Integer.parseInt(observatoryB) - 1]);

			if (!(observatoryNotGood.contains(observatoryA)) && elevationA <= elevationB) {
				observatoryNotGood.add(observatoryA);
			}

			if (!(observatoryNotGood.contains(observatoryB)) && elevationB <= elevationA) {
				observatoryNotGood.add(observatoryB);
			}
		}

		// 出力
		System.out.println(numberOfElevation - observatoryNotGood.size());
		sc.close();
	}
}
