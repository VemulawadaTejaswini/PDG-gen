import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{

    public static final int FIRST_NUMBER = 0;
    public static final int SECOND_NUMBER = 1;

    public static void main(String[] args) throws NumberFormatException, IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int vertical = Integer.parseInt(br.readLine());
	int horizontal = Integer.parseInt(br.readLine());

	/*
	 * for (int i = 0; i < horizontal; i++) {
	 * 
	 * }
	 */

	//
	List<int[]> inputArrays = new ArrayList<>();
	for (int i = 0; i < horizontal; i++) {
	    String[] queryStr = br.readLine().split(",");
	    int[] query = new int[2];
	    query[FIRST_NUMBER] = Integer.parseInt(queryStr[FIRST_NUMBER]);
	    query[SECOND_NUMBER] = Integer.parseInt(queryStr[SECOND_NUMBER]);
	    inputArrays.add(query);
	}

	//
	int[] outputArray = getDrawedArray(inputArrays, vertical, horizontal);

	//
	for (int i = 1; i < outputArray.length; i++) {
	    System.out.println(outputArray[i]);
	}

    }

    private static int[] getDrawedArray(List<int[]> inputArrays, int amidaLength, int loopCount) {
	// ?????\?????????????????????????????????????????????
	// outputArray[0]????????¨?????????
	int[] outputArray = new int[amidaLength + 1];
	for (int i = 1; i < outputArray.length; i++) {
	    outputArray[i] = i;
	}

	for (int[] query : inputArrays) {
	    int mediator = 0;

	    mediator = outputArray[query[FIRST_NUMBER]];
	    outputArray[query[FIRST_NUMBER]] = outputArray[query[SECOND_NUMBER]];
	    outputArray[query[SECOND_NUMBER]] = mediator;

	}

	return outputArray;

    }

}