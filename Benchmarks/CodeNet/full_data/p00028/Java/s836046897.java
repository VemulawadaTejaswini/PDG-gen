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

			if(numCount.containsKey(num)) {
				numPlus = numCount.get(num) + 1;
			} else {
				numPlus = 1;
			}

			numCount.put(num, numPlus);
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
                return entry2.getValue().compareTo(entry1.getValue());
            }
        });

		int counter = 0;
		for(int $ = 0; $ < entries.size(); $++) {
			if(entries.get($).getValue() >= counter) {
				System.out.println(entries.get($).getKey());
				counter = entries.get($).getValue();
			}
		}

	}

}