import java.util.*;

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
		List<Integer> array = getStrings(sc, n);
		array.sort(Integer::compareTo);
		int[] result = new int[1000001];
		int max = array.get(array.size()-1);
		int count = 0;
		for (int i = 0; i < array.size(); i++) {
			int m = array.get(i);
			if (result[m] == 0) {
				for (int j = m; j <= max; j+=m) {
					result[j]++;
				}
			} else {
				result[m]++;
			}
		}
		for (int i = 0; i < array.size(); i++) {
			if (result[array.get(i)] == 1) {
				count++;
			}
		}
		System.out.println(count);
		return;
	}

}
