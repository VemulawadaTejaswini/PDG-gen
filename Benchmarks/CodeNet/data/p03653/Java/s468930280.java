import java.util.*;

public class Main {
    static final long BASE = 100001;
    static HashMap<Long, Long> map = new HashMap<>();
    static int[][] holds;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		holds = new int[3][x + y + z + 1];
		for (int i = 1; i <= x + y + z; i++) {
		    holds[0][i] = sc.nextInt();
		    holds[1][i] = sc.nextInt();
		    holds[2][i] = sc.nextInt();
		}
		System.out.println(dfw(x, y, z));
	}
	
	static long dfw(int x, int y, int z) {
	    long key = x * BASE * BASE + y * BASE + z;
	    if (map.containsKey(key)) {
	        return map.get(key);
	    }
	    long ans = 0;
	    if (x > 0) {
	        ans = Math.max(ans, dfw(x - 1, y, z) + holds[0][x + y + z]);
	    }
	    if (y > 0) {
	        ans = Math.max(ans, dfw(x, y - 1, z) + holds[1][x + y + z]);
	    }
	    if (z > 0) {
	        ans = Math.max(ans, dfw(x, y, z - 1) + holds[2][x + y + z]);
	    }
	    map.put(key, ans);
	    return ans;
	}
}
