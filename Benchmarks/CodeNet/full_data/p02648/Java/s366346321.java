import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        ArrayList<TreeMap<Integer, Integer>> dp = new ArrayList<>();
		dp.add(new TreeMap<>());
		dp.get(0).put(0, 0);
		for (int i = 1; i <= n; i++) {
		    String[] line = br.readLine().split(" ", 2);
		    int value = Integer.parseInt(line[0]);
		    int weight = Integer.parseInt(line[1]);
    		TreeMap<Integer, Integer> map = (TreeMap<Integer, Integer>)(dp.get(i / 2).clone());
    		for (Map.Entry<Integer, Integer> entry : dp.get(i / 2).entrySet()) {
    		    if (map.floorEntry(entry.getKey() + weight).getValue() >= entry.getValue() + value) {
    		        continue;
    		    }
    		    map.put(entry.getKey() + weight, entry.getValue() + value);
    		    Integer key = null;
    		    while ((key = map.higherKey(entry.getKey() + weight)) != null) {
    		        if (map.get(key) <= entry.getValue() + value) {
    		            map.remove(key);
    		        } else {
    		            break;
    		        }
    		    }
    		}
		    dp.add(map);
		}
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    String[] line = br.readLine().split(" ", 2);
		    int ans = dp.get(Integer.parseInt(line[0])).floorEntry(Integer.parseInt(line[1])).getValue();
		    sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}
}
