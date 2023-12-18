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
		int[][] examArray = new int[q][2];
		for(int i = 0; i < q; i++) for(int j =0; j < 2; j++) examArray[i][j] = sc.nextInt();
		int[] memoArray = new int[size[0] * size[1]];
		Arrays.fill(memoArray, 0);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< q; i++){
			int l = examArray[i][0];
			int r = examArray[i][1];
			long sum = 0;
			int x = l;
			while(x < r){
				if(memoArray[x] != 0){
					sum += memoArray[x];
					x+=d;
					continue;
				}

				Entry<Integer, Integer> e1 = map.get(x);
				Entry<Integer, Integer> e2 = map.get(x + d);
				int score = Math.abs(e2.getKey() - e1.getKey()) + Math.abs(e2.getValue() - e1.getValue());
				sum += score;
				memoArray[x] = score;
				x += d;
			}
			sb.append(sum + "\n");
		}
		System.out.println(sb.toString());
	}
}
