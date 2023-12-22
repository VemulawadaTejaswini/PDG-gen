import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int k = stdIn.nextInt();

		List<Integer> brightnessList = IntStream.range(0, n).mapToObj(i -> stdIn.nextInt()).collect(Collectors.toList());
		stdIn.close();

		int pow = (int)Math.pow(2,Integer.min(k-1, 18));
		if(n < pow) {
			printFull(n);
			return;
		}

		LampStreet street = new LampStreet(brightnessList);

		for (int i = 0; i < k; i++) {
			if(street.execute()) {
				break;
			}

		}
		street.print();

	}

	private static void printFull(int n) {
		StringJoiner sj = new StringJoiner(" ");
		for (int i = 0; i < n; i++) {
			sj.add(Integer.toString(n));

		}

		System.out.println(sj.toString());
	}
}

class LampStreet {

	private Map<Integer, Integer> lampMap = new LinkedHashMap<Integer, Integer>();

	public LampStreet(List<Integer> lampList) {

		for (int i = 0; i < lampList.size(); i++) {
			this.lampMap.put(i, lampList.get(i));
		}
	}

	public boolean execute() {

		int size = lampMap.size();
		Map<Integer,Integer> lampMap = new LinkedHashMap<>();
		for (int i = 0; i < size; i++) {
			lampMap.put(i, 0);

		}

		//範囲の配列を作成する
		int[][] rangeArray = new int[size][2];

		int allAddCnt = 0;
		for (int i = 0; i < rangeArray.length; i++) {
			int min = Integer.max(i - this.lampMap.get(i), 0);
			int max = Integer.min(i + this.lampMap.get(i), size-1);

			if(min == 0 && max == size-1) {
				allAddCnt++;
				continue;
			}

			for (int j = min; j <= max; j++) {
				lampMap.replace(j, lampMap.get(j)+1);
			}

		}

		//最後に全足しするやつ
		int minCnt = size;

		for (int i = 0; i < size; i++) {
			int old = lampMap.get(i);
			lampMap.replace(i, old + allAddCnt);
			minCnt = Integer.min(old + allAddCnt, size);
		}


		this.lampMap = lampMap;

		return minCnt == size;
	}

	public void print(){
		StringJoiner sj = new StringJoiner(" ");
		for (Entry<Integer, Integer> lamp : lampMap.entrySet()) {
			sj.add(lamp.getValue().toString());
		}

		System.out.println(sj.toString());
	}

}