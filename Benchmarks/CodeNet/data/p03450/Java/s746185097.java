import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	private static int L_NUMBER = 0;
	private static int R_NUMBER = 1;
	private static int D_NUMBER = 2;

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String firstLine = sc.nextLine();
			List<Integer> firstLineList = convertToIntList(firstLine);
			int n = firstLineList.get(L_NUMBER);
			int m = firstLineList.get(R_NUMBER);
			boolean result = true;
			if(m!=0) {
				HashMap<Integer, Integer> positionMap = new HashMap<>();
				String secondLine = sc.nextLine();
				List<Integer> secondLineList = convertToIntList(secondLine);
				positionMap.put(secondLineList.get(L_NUMBER), 0);
				positionMap.put(secondLineList.get(R_NUMBER), secondLineList.get(D_NUMBER));
				List<String> unKnownList = new ArrayList<>();

				for(int i = 1 ; i < m && result ; i++) {
					result = setPositionMap(sc, result, positionMap, unKnownList);
				}
				while(unKnownList.size() != 0) {
					for(String line : unKnownList) {
						result = setPositionMap(sc, result, positionMap, unKnownList);
					}
				}
			}
			if(result) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
	}

	private static boolean setPositionMap(Scanner sc, boolean result, HashMap<Integer, Integer> positionMap,
			List<String> unKnownList) {
		String nextLine = sc.nextLine();
		List<Integer> dataList = convertToIntList(nextLine);
		int l = dataList.get(L_NUMBER);
		int r = dataList.get(R_NUMBER);
		int d = dataList.get(D_NUMBER);
		if(notContainBothArgs(positionMap,l,r)) {
			unKnownList.add(nextLine);
			return result;
		}
		unKnownList.remove(nextLine);
		if(positionMap.containsKey(l)){
			if(!positionMap.containsKey(r)) {
				positionMap.put(r,positionMap.get(l) + d);
			} else {
				Integer lPos = positionMap.get(l);
				Integer rPos = positionMap.get(r);
				if(lPos + d != rPos) {
					result = false;
				}
			}
		} else {
			positionMap.put(l,positionMap.get(r) - d);
		}
		return result;
	}

	private static List<Integer> convertToIntList(String line){
		return Arrays.asList(line.split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
	}

	private static boolean notContainBothArgs(HashMap<Integer, Integer> positionMap, Integer l, Integer r) {
		return !positionMap.containsKey(l) && !positionMap.containsKey(r);
	}
}