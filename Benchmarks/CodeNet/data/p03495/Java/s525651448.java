import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

		// --- input ---
		int[] l1 = getNums(in.readLine().split(" "), 2);
		int[] vals = getNums(in.readLine().split(" "), l1[0]);
		in.close();

		// --- resolv ---
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int v : vals) {
			if(map.containsKey(v)) {
				map.put(v, map.get(v) + 1);
			} else {
				map.put(v, 1);
			}
		}

		Object[] ary = map.values().stream().sorted((a, b) -> b - a).toArray();

		int ans = 0;
		for(int i=0; i < ary.length; i++) {
			if(i < l1[1]) {
				continue;
			}
			ans += (int)ary[i];
		}

		System.out.println(ans);
	}

	public static int[] getNums(String[] vals, int num) {
		int[] vAry = new int[num];
		for(int i=0; i < num; i++) {
			vAry[i] = Integer.parseInt(vals[i]);
		}
		return vAry;
	}
}