import java.util.*;

public class Main {
    static int[] arr;
    static ArrayList<HashMap<Integer, Integer>> dp = new ArrayList<>();
    static int n;
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	arr = new int[n * 3];
    	for (int i = 0; i < n * 3; i++) {
    	    arr[i] = sc.nextInt() - 1;
    	}
    	for (int i = 0; i < n; i++) {
    	    dp.add(new HashMap<>());
    	}
    	System.out.println(dfw(Math.min(arr[0], arr[1]),Math.max(arr[0], arr[1]), 0));
    }
    
    static int dfw(int first, int second, int idx) {
        int key = first * n + second;
        if (dp.get(idx).containsKey(key)) {
            return dp.get(idx).get(key);
        }
        if (idx == n - 1) {
            if (first == second && first == arr[3 * n - 1]) {
                return 1;
            } else {
                return 0;
            }
        }
        int[] tmp = new int[]{first, second, arr[idx * 3 + 2], arr[idx * 3 + 3], arr[idx * 3 + 4]};
        Arrays.sort(tmp);
        if (tmp[0] == tmp[1] && tmp[1] == tmp[2]) {
            int value = dfw(tmp[3], tmp[4], idx + 1) + 1;
            dp.get(idx).put(key, value);
            return value;
        }
        if (tmp[1] == tmp[2] && tmp[2] == tmp[3]) {
            int value = dfw(tmp[0], tmp[4], idx + 1) + 1;
            dp.get(idx).put(key, value);
            return value;
        }
        if (tmp[2] == tmp[3] && tmp[3] == tmp[4]) {
            int value = dfw(tmp[0], tmp[1], idx + 1) + 1;
            dp.get(idx).put(key, value);
            return value;
        }
        int value = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                value = Math.max(value, dfw(tmp[i], tmp[j], idx + 1));
            }
        }
        dp.get(idx).put(key, value);
        return value;
    }
}

