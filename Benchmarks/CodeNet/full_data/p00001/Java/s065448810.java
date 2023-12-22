import java.util.Arrays;
import java.util.List;

public class Main{
	public static void main(String[] args) {

		int[] hillsHight = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();

		List<int[]> hillsHightList = Arrays.asList(hillsHight);

		hillsHightList.sort(null);

		System.out.println(hillsHightList.get(0));
		System.out.println(hillsHightList.get(1));
		System.out.println(hillsHightList.get(2));
	}
}