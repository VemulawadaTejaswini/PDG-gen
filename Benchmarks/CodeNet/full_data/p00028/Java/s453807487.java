import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//??\???????´???¨TreeMap??????
		Map<Integer, Integer> numCount = new HashMap<Integer, Integer>();
		Integer num; //??\?????§???????????£?????°???
		Integer numPlus = 0;

		while(sc.hasNext()) { //??\?????¶?????°?????????
			num = sc.nextInt();
			numPlus = numCount.get(num);

			if(numPlus != null) {
				numPlus =+ 1;
			} else {
				numPlus = 1;
			}

			numCount.put(num, numCount.get(numPlus));
		}

		List<Map.Entry<Integer, Integer>> entries
		= new ArrayList<Map.Entry<Integer, Integer>>(numCount.entrySet());

		//???????????\??????????????????????????????????????????
		Collections.sort(entries
				, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(
            		Entry<Integer, Integer> entry1
            		, Entry<Integer, Integer> entry2) {
                // 4. ??????
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

		int counter = 0;
		for(Entry<Integer, Integer> number : entries) {
			if(number.getValue() >= counter) {
				System.out.println(number.getKey());
				counter = number.getValue();
			}
		}

		System.out.println();

	}

}