import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] size = {sc.nextInt(), sc.nextInt()};
		int d = sc.nextInt();
		Map<Integer, Entry<Integer, Integer>> map = new HashMap<>();
		for(int i = 0; i< size[0]; i++){
			for(int j = 0; j < size[1]; j++)map.put(sc.nextInt(), new SimpleEntry<>(i,j));
		}
		int q = sc.nextInt();
		int[] memoArray = new int[size[0] * size[1]];
		Arrays.fill(memoArray, 0);
		StringBuilder sb = new StringBuilder();
		String end = "\n";
		for(int i = 0; i< q; i++){
			int l = sc.nextInt();
			int r = (sc.nextInt() - l) / d;
			int sum = 0;
			for(int j = 0; j < r; j++){
				int num = l + j * d;
				int next = num + d;
				if(memoArray[num] != 0){
					sum += memoArray[num];
					continue;
				}
				Entry<Integer, Integer> e1 = map.get(num);
				Entry<Integer, Integer> e2 = map.get(next);
				int count = Math.abs(e2.getKey() - e1.getKey()) + Math.abs(e2.getValue() - e1.getValue());
				memoArray[num] = count;
				sum+= count;
			}
			sb.append(sum);
			sb.append(end);
		}
		System.out.println(sb.toString());
	}
}