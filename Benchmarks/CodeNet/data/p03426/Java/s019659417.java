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
		for(int i  = 1; i < size[0] * size[1]; i++){
			if(i <= d){
				memoArray[i-1] = 0;
				continue;
			}

			Entry<Integer, Integer> e1 = map.get(i-d);
			Entry<Integer, Integer> e2 = map.get(i);
			memoArray[i-1] = memoArray[i-d - 1] + Math.abs(e2.getKey() -e1.getKey()) + Math.abs(e2.getValue() - e1.getValue());
		}
		for(int i = 0; i < q; i++){
			int l = sc.nextInt();
			int r = sc.nextInt();
			sb.append(memoArray[r-1] - memoArray[l-1]);
			if(i < q-1)sb.append(end);
		}
		System.out.println(sb.toString());
	}
}
