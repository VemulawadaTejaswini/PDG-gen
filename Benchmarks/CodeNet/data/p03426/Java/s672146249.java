import java.util.AbstractMap.SimpleEntry;
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
		for(int i = 0; i< q; i++){
			int l = examArray[i][0];
			int r = examArray[i][1];
			long sum = 0;
			while(l < r){
				Entry<Integer, Integer> e1 = map.get(l);
				l += d;
				Entry<Integer, Integer> e2 = map.get(l);
				sum += Math.abs(e2.getKey() - e1.getKey()) + Math.abs(e2.getValue() - e1.getValue());
			}
			System.out.println(sum);
		}
	}
}