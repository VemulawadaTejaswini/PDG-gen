import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		String[] myArray = in.nextLine().trim().split(" ");

		int maxLength = 0;
		String maxLengthString = "";
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i].length() > maxLength)
				maxLength = myArray[i].length();
				maxLengthString = myArray[i];
		}
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(myArray));
		int maxFrequency = 0;
		String maxFrequencyString = "";
		for (int i = 0; i < arrayList.size(); i++) {
			if (Collections.frequency(arrayList, arrayList.get(i)) > maxFrequency) {
				maxFrequency = Collections.frequency(arrayList, arrayList.get(i));
				maxFrequencyString = arrayList.get(i);
			}
		}
		System.out.println(maxFrequencyString + " " + maxLengthString);

	}
}