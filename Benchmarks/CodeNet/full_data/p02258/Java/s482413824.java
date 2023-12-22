import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	private static Scanner scanner;
	public static void main(String[] args) {
		int answer = 0;
		boolean flag = false;
		List<Integer> list = new ArrayList<Integer>();
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0; i<n; i++){
			list.add(scanner.nextInt());
		}
		List<Integer> distinctList = distinct(list);
		Collections.sort(distinctList);
		for(int i=1; i<distinctList.size()-1; i++){
			int maxIndex = list.lastIndexOf(distinctList.get(distinctList.size() - (i + 1)));
			List<Integer> tmpList = list.subList(0, maxIndex);
			if(!flag){
				answer = distinctList.get(distinctList.size() - (i+1)) - Collections.min(tmpList);
				flag = true;
			}
			else if(answer < (distinctList.get(distinctList.size() - i) - Collections.min(tmpList))){
				answer = distinctList.get(distinctList.size() - (i+1)) - Collections.min(tmpList);
			}
		}
		System.out.println(answer);
	}
	public static List<Integer> distinct(List<Integer> list){
		List<Integer> distictList = new ArrayList<Integer>();
		for(int i: list){
			if(!distictList.contains(i))distictList.add(i);
		}
		return distictList;
	}
}