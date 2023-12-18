import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static Map<Integer, Entry<Integer, Integer>> map = new HashMap<>();
	static int[][] lrGrid;
	static int d;
	static Map<Integer, Integer> memoMap = new HashMap<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		d = sc.nextInt();
		int[][] aGrid = new int[h][w];
		for(int i = 0; i < h;i++){
			for(int  j = 0; j < w; j++){
				map.put(sc.nextInt(), new SimpleEntry<>(i, j));
			}
		}
		int q = sc.nextInt();
		lrGrid = new int[q][2];
		for(int i = 0; i < q; i++){
			lrGrid[i][0] = sc.nextInt();
			lrGrid[i][1] = sc.nextInt();
		}
		int mp = 0;
		for(int i = 0; i< q;i++){
			System.out.println(move(lrGrid[i][1], lrGrid[i][0]));
		}
	}

	public static int move(int end, int now){
		if(now == end){
			return 0;
		}
		if(memoMap.containsKey(now)){
			return memoMap.get(now);
		}

		int mp = 0;
		Entry<Integer, Integer> e1 = map.get(now);
		Entry<Integer, Integer> e2 = map.get(now+d);
		mp += Math.abs(e1.getKey() -e2.getKey()) + Math.abs(e1.getValue() - e2.getValue());
		memoMap.put(now, mp);
		mp += move(end, now+d);
		return mp;
	}
}