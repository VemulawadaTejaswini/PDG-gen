import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> evenNumList = new ArrayList<>();
		ArrayList<Integer> oddNumList = new ArrayList<>();
		HashMap<String, Integer> evenNumCnt = new HashMap<>();
		HashMap<String, Integer> oddNumCnt = new HashMap<>();

		int len = sc.nextInt();
		int result = 0;

		for (int i = 0; i < len; i++) {

			if (i==0 || i % 2 == 0) {
				hogehoge(sc.nextInt(), evenNumList, evenNumCnt);

			} else {
				hogehoge(sc.nextInt(), oddNumList, oddNumCnt);
			}
		}
      
        if (evenNumList.size() == 1
             && oddNumList.size() == 1
             && evenNumList.get(0) == oddNumList.get(0)) {
            result = len / 2;
        } else {

	    	if (evenNumList.size() != 1) {
		        result = getResult(evenNumList, evenNumCnt, len);
		    }
		    if (oddNumList.size() != 1) {
			    result += getResult(oddNumList, oddNumCnt, len);
		    }
        }

		System.out.println(result);
		sc.close();
	}

	public static void hogehoge(int num, ArrayList<Integer> list, HashMap<String,Integer> map) {

		String str = Integer.toString(num);

		if (list.contains(num)) {
			int cnt = map.get(str) + 1;
			map.put(str, cnt);

		} else {
			list.add(num);
			map.put(str, (int) 1);
		}
	}

	public static int getResult(ArrayList<Integer> list, HashMap<String,Integer> map, int len) {

		int tmpCnt = 0;
		int tmpNum = len / 2;
        int totalCnt = 0;

		for (int num : list) {

			int cnt = map.get(Integer.toString(num));

			if (cnt > tmpNum / 2) {
				return tmpNum - cnt;

			} else {

				if (tmpCnt < cnt) {
					tmpCnt = cnt;
                    totalCnt += cnt;
                  
                    if (totalCnt > tmpCnt) {
                        return tmpNum - tmpCnt;
                    }
				}
			}
		}
		return tmpNum - tmpCnt;
	}
}
