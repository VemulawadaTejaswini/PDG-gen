import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		Map<Integer, Boolean> AMap = new HashMap<>();
		for (int i = 0; i < length; i++) {
			Integer a = sc.nextInt();
			if(AMap.containsKey(a)) {
				AMap.put(a , Boolean.FALSE);
			} else {
				AMap.put(a , Boolean.TRUE);
			}
		}
		
		for (Entry<Integer, Boolean> ai : AMap.entrySet()) {
			int aiNum = ai.getKey();
			boolean aiBool = ai.getValue();
			if(aiBool) {
				for (Entry<Integer, Boolean> bj : AMap.entrySet()) {
					int bjNum = bj.getKey();
					boolean bjBool = bj.getValue();
					if(bjNum == aiNum) continue;
					if(aiNum % bjNum == 0) {
						ai.setValue(Boolean.FALSE);
					}
					
					if(bjBool && bjNum % aiNum == 0) {
						bj.setValue(Boolean.FALSE);
					}
				}
			}
		}

		int count = 0;
		for (Entry<Integer, Boolean> i : AMap.entrySet()) {
			if(i.getValue()) count++;
		}

		System.out.println(count);
	}

}