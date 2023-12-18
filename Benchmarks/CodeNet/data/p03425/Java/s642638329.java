import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{


	public static void main(String[] args) {
		Map<InitialValue, Initial> initialsMap = getInitialsMap();
		try(Scanner sc = new Scanner(System.in)){
			int menberCount = Integer.parseInt(sc.nextLine());
			for(int i = 0 ; i< menberCount; i++) {
				updateIntialsMap(initialsMap ,sc.nextLine());
			}
		};
		System.out.println(calcPattern(initialsMap));
	}

	private static int calcPattern(Map<InitialValue, Initial> initialsMap) {
		List<Initial> initials = new ArrayList<>(initialsMap.values());
		int size = initials.size();
		int count = 0;
		for(int i = 0 ; i< size ; i++) {
			Initial first = initials.get(i);
			for(int j = i+1 ; j < size ; j++) {
				Initial secound = initials.get(j);
				for(int k = j+1 ; k < size ; k++) {
					Initial third = initials.get(k);
					count += first.getCount() * secound.getCount() * third.getCount();
				}
			}
		}
		return count;
	}

	private static void updateIntialsMap(Map<InitialValue, Initial> initialsMap, String name) {
		String targetInitial = String.valueOf(name.charAt(0));
		switch(targetInitial) {
			case "M":
				increaseInital(InitialValue.M,initialsMap);
				break;
			case "A":
				increaseInital(InitialValue.A,initialsMap);
				break;
			case "R":
				increaseInital(InitialValue.R,initialsMap);
				break;
			case "C":
				increaseInital(InitialValue.C,initialsMap);
				break;
			case "H":
				increaseInital(InitialValue.H,initialsMap);
				break;
			default:
				break;
		}
	}

	private static void increaseInital(InitialValue m, Map<InitialValue, Initial> initialsMap) {
		initialsMap.get(m).increase();
	}

	private static Map<InitialValue, Initial> getInitialsMap() {
		Map<InitialValue, Initial> initialsMap = new HashMap<>();
		initialsMap.put(InitialValue.M, new Initial());
		initialsMap.put(InitialValue.A, new Initial());
		initialsMap.put(InitialValue.R, new Initial());
		initialsMap.put(InitialValue.C, new Initial());
		initialsMap.put(InitialValue.H, new Initial());
		return initialsMap;
	}

	private static enum InitialValue{
		M,A,R,C,H;
	}

	private static class Initial{
		private int count;

		private void increase() {
			count++;
		}

		public int getCount() {
			return count;
		}

	}
}
