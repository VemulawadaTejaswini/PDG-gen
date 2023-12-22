import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

    static int[] weightList = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512 };

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	while (sc.hasNextInt()) {
	    int input = sc.nextInt();

	    List<Integer> weights = dividedNumber(input);
	    Collections.sort(weights);
	    StringBuilder sb = new StringBuilder();
	    for (Integer integer : weights) {
		sb.append(integer.toString());
		sb.append(" ");
	    }
	    System.out.println(sb.substring(0, sb.length() - 1));
	}
    }

    private static List<Integer> dividedNumber(double input) {
	List<Integer> weights = new ArrayList<>();
	for (int i = weightList.length - 1; i >= 0; i--) {
	    if (input / (double) weightList[i] == 1d) {
		weights.add(weightList[i]);
		break;
	    }
	    if (input / (double) weightList[i] > 1d) {
		weights = dividedNumber(input % weightList[i]);
		weights.add(weightList[i]);
		break;
	    }
	}
	return weights;
    }

}