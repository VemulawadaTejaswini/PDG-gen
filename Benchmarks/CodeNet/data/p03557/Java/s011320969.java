
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Map<Integer , Map<Integer, Integer>> memoMap = new HashMap<>(3);
	static int[][] array;
	static int length;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		length = Integer.parseInt(sc.nextLine());
		array = new int[3][length];
		for(int i =0; i < 3; i++){
			array[i] = parse(sc.nextLine().split(" "));
			memoMap.put(i, new HashMap<Integer,Integer>(length));
		}

		int sum = 0;
		for(int i = 0; i < length; i++){
			sum += count(0,i);
		}
		System.out.println(sum);
	}


	private static int count(int arrayNum, int num){
		int number = array[arrayNum][num];
		Map<Integer, Integer> map = memoMap.get(arrayNum);
		if(map.containsKey(number)) return map.get(number);

		int count = 0;
		for(int i =0; i < length;i++){
			int nextNum = array[arrayNum+1][i];
			if(number < nextNum) count += arrayNum == 0 ? count(arrayNum+1, i) : 1;
		}
		map.put(number, count);
		return count;
	}



	private static int[] parse(String[] sArray){
		int[] iArray = new int[sArray.length];
		for(int i =0; i < sArray.length;i++){
			iArray[i] = Integer.parseInt(sArray[i]);
		}

		return iArray;
	}
}