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
		Set<Integer> set = new HashSet<>();
		int max = array.get(array.size()-1);
		int count = 0;
		for (int i = 0; i < array.size(); i++) {
			for (int j = 2; j <= max/array.get(i) + 1; j++) {
				set.add(array.get(i) * j);
			}
			if (i != array.size()-1 && array.get(i).intValue() == array.get(i+1).intValue()) {
				continue;
			} else if (i != 0 && array.get(i).intValue() == array.get(i-1).intValue()) {
				continue;
			}
			if (!set.contains(array.get(i))) {
				count++;
//				System.out.print(array.get(i) + ", ");
			}
		}
		System.out.println(count);
		return;
		Integer
	}

}
//12, 18, 28, 44, 47, 61, 76, 81, 86, 102, 105, 158, 159, 201, 205, 219, 236, 238, 239, 253, 254, 257, 261, 268, 272, 275, 283, 285, 298, 299, 314, 350, 398, 406, 421, 454, 455, 473, 513, 520, 548, 556, 565, 590, 613, 617, 641, 677, 697, 699, 734, 749, 755, 772, 834, 851, 866, 871, 873, 877, 885, 916, 921, 938, 951, 965, 994,
//12, 18, 28, 44, 47, 61, 76, 81, 86, 102, 105, 158, 159, 201, 205, 219, 236, 238, 239, 253, 254, 257, 261, 268, 272, 275, 283, 285, 298, 299, 314, 350, 398, 406, 421, 454, 455, 473, 513, 520, 548, 556, 565, 590, 613, 617, 641, 677, 697, 699, 734, 749, 755, 772, 814, 814, 834, 851, 866, 871, 873, 877, 885, 913, 913, 916, 921, 938, 951, 965, 994, 999, 999