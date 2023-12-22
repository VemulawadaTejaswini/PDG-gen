import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int m = sc.nextInt();

		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> wMap = new HashMap<Integer, Integer>();
		HashSet<String> set = new HashSet<String>();

		for (int i=0; i<m; i++){
			int bh = sc.nextInt();
			int bw = sc.nextInt();

			if (hMap.containsKey(bh)){
				hMap.put(bh, hMap.get(bh)+1);
			} else {
				hMap.put(bh, 1);
			}
			if (wMap.containsKey(bw)){
				wMap.put(bw, wMap.get(bw)+1);
			} else {
				wMap.put(bw, 1);
			}
			String val = bh + "," + bw;
			set.add(val);
		}

        List<Map.Entry> hMapValuesList = new ArrayList<Map.Entry>(hMap.entrySet());

        Collections.sort(hMapValuesList, new Comparator<Map.Entry>() {

            @Override

            public int compare(Entry entry1, Entry entry2) {

                return ((Integer) entry2.getValue()).compareTo((Integer) entry1
                        .getValue());
            }
        });

        List<Map.Entry> wMapValuesList = new ArrayList<Map.Entry>(wMap.entrySet());

        Collections.sort(wMapValuesList, new Comparator<Map.Entry>() {

            @Override

            public int compare(Entry entry1, Entry entry2) {

                return ((Integer) entry2.getValue()).compareTo((Integer) entry1
                        .getValue());
            }
        });

		int ans = 0;
		int maxhValue=(int) hMapValuesList.get(0).getValue();
		int maxwValue=(int) wMapValuesList.get(0).getValue();
		boolean finish = false;

		for (int i=0; i<hMapValuesList.size(); i++){

			int hKey = (int) hMapValuesList.get(i).getKey();
			int hValue = (int) hMapValuesList.get(i).getValue();

			if (maxhValue != hValue){
				break;
			}

			for (int j=0; j<wMapValuesList.size(); j++){

				int wKey = (int) wMapValuesList.get(j).getKey();
				int wValue = (int) wMapValuesList.get(j).getValue();

				if (maxwValue != wValue){
					break;
				}

				int exp = hValue + wValue;

				String val = hKey + "," + wKey;
				if (set.contains(val)){
					exp--;
				} else {
					finish = true;
				}
				ans = Math.max(ans, exp);
				if (finish){
					break;
				}
			}
			if (finish){
				break;
			}

		}
		System.out.println(ans);

	}


}