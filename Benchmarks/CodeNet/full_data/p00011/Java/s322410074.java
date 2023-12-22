import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static final int FIRST_NUMBER = 0;
    public static final int SECOND_NUMBER = 1;

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	// ?¨??????\?????¨????????????????£?
	int arrayLength = Integer.parseInt(sc.nextLine());
	int loopCount = Integer.parseInt(sc.nextLine());

	// ?????\???????????????
	int[] outputArray = new int[arrayLength + 1];
	for (int i = 0; i < outputArray.length; i++) {
	    outputArray[i] = i;
	}

	// ??\????????????
	List<int[]> inputArrays = new ArrayList<>();

	for (int i = 0; i < loopCount; i++) {
	    String[] queryStr = sc.nextLine().split(",");
	    int[] query = new int[2];
	    query[FIRST_NUMBER] = Integer.parseInt(queryStr[FIRST_NUMBER]);
	    query[SECOND_NUMBER] = Integer.parseInt(queryStr[SECOND_NUMBER]);
	    inputArrays.add(query);
	}

	// lots???draw?????????????????????outputArray???????´???????
	exchangeLine(inputArrays, outputArray);

	// ?????????????????????
	for (int i = 1; i < outputArray.length; i++) {
	    System.out.println(outputArray[i]);
	}

    }

    private static void exchangeLine(List<int[]> inputArrays, int[] outputArray) {

	for (int[] query : inputArrays) {
	    int mediator = 0;

	    mediator = outputArray[query[FIRST_NUMBER]];
	    outputArray[query[FIRST_NUMBER]] = outputArray[query[SECOND_NUMBER]];
	    outputArray[query[SECOND_NUMBER]] = mediator;

	}

    }
}