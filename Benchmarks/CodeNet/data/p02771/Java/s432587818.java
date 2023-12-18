import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Integer num1 = Integer.valueOf(args[0]);
		Integer num2 = Integer.valueOf(args[1]);
		Integer num3 = Integer.valueOf(args[2]);
		
		List<Integer> numlist = Arrays.asList(num1, num2, num3);
		Collections.sort(numlist);
		if (numlist.get(0) != numlist.get(1) && numlist.get(1) != numlist.get(2)) {
			System.out.println("Yes");
		}
		System.out.println("No");
	}

}
