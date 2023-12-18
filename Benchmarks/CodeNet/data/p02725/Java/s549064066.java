import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int round = sc.nextInt();
			int houseNum = sc.nextInt();
			List<Integer> tmpLength = Arrays.stream(sc.next().split(" ")).map(Integer::valueOf)
					.collect(Collectors.toList());

			List<Integer> houseLength = new ArrayList<>(houseNum);
			for (int i = 0; i < tmpLength.size() - 1; i++) {
				houseLength.add(tmpLength.get(i + 1) - tmpLength.get(i));
			}
			int firstToLast = tmpLength.get(0) + (round - tmpLength.get(houseNum - 1));
			houseLength.add(firstToLast);
			
			OptionalInt max = houseLength.stream().mapToInt(i -> i.intValue()).max();
			int minLength  = houseLength.stream().mapToInt(i -> i.intValue()).sum() - max.getAsInt();
			System.out.println(minLength);
		}

	}
}