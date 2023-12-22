import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Main {
    static Integer[] dp;
    static int INF = (int) 1e9 + 7;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        char[] arr = in.readLine().toCharArray();
        Map<Integer, Long> map = new HashMap<>();
        long res = 0;
        for(int i = 0; i < arr.length; i++) {
            Set<Integer> set = new HashSet<>(map.keySet());
            for(int num : set) {
                int prev = num;
                num = num * 10 + arr[i] - '0';
                num %= 2019;
                if(num == 0) {
                    res += map.get(prev);
                } else {
                    map.put(num, map.getOrDefault(num, 0L) + map.get(prev));
                }
                map.remove(prev);
            }
            map.put(arr[i] - '0', map.getOrDefault(arr[i] - '0', 0L) + 1);
        }
        out.println(res);
        out.close();
        in.close();
    }
}
