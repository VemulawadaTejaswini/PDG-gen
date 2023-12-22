import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfTop3Hills {
	public static void main(String[] args) {

		int[] hillsHight = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();

		List<Integer> hillsHightList = new ArrayList<>();
		for (int i = 0; i < hillsHight.length; i++) {
			hillsHightList.add(Integer.valueOf(hillsHight[i]));
		}

		Collections.sort(hillsHightList, Comparator.reverseOrder());

		System.out.println(hillsHightList.get(0));
		System.out.println(hillsHightList.get(1));
		System.out.println(hillsHightList.get(2));
	}
}