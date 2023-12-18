import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String[] lineString = sc.nextLine().split(" ");
		int[] elevationList = new int[Integer.parseInt(lineString[0])];
		ArrayList<String> observatoryList = new ArrayList<String>();
		int numberOfLoad = Integer.parseInt(lineString[1]);

		lineString = sc.nextLine().split(" ");
		for (int observatory = 0; observatory < elevationList.length; observatory++) {
			elevationList[observatory] = Integer.parseInt(lineString[observatory]);
			observatoryList.add(Integer.toString(observatory + 1));
		}

		for (int load = 0; load < numberOfLoad; load++) {
			lineString = sc.nextLine().split(" ");
			String observatoryAS = lineString[0];
			String observatoryBS = lineString[1];
			int observatoryA = Integer.parseInt(observatoryAS) - 1;
			int observatoryB = Integer.parseInt(observatoryBS) - 1;

			if (observatoryList.contains(observatoryAS) && elevationList[observatoryA] <= elevationList[observatoryB]) {
				observatoryList.remove(observatoryAS);
			}

			if (observatoryList.contains(observatoryBS) && elevationList[observatoryB] <= elevationList[observatoryA]) {
				observatoryList.remove(observatoryBS);
			}
		}

		// 出力
		System.out.println(observatoryList.size());
		sc.close();
	}
}
